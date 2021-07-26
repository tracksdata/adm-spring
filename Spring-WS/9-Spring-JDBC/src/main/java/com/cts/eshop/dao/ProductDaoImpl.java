package com.cts.eshop.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Transactional;

import com.cts.eshop.model.Product;



@Repository
public class ProductDaoImpl {
	
	/*
	  
	  	dbcTemplate can query for
	  -------------------------------
		– Simple types (int, long, String, Date, ...) 
		– Generic Maps
		– Domain Objects
		
		Query with no bind variables: queryForObject
		
		
		Generic Queries
		• JdbcTemplate returns each row of a ResultSet as a Map
		
		• When expecting a single row
			– Use queryForMap(..)
		• When expecting multiple rows
			– Use queryForList(..)
			
			
			Domain Objects
			----------------
			1. RowMapper interface : for single record of Domain Object
				-> mapRow
			2. RowCallbackHandler interface
				-> void processRow
			3. ResultsetExtractor interface
				-> extractData
	 */

	private JdbcTemplate jdbcTemplate;

	@Autowired
	public ProductDaoImpl(DataSource dataSource) {
		jdbcTemplate = new JdbcTemplate(dataSource);
	}

	// simple data type
	public long getPersonCount() {
		String sql = "select count(*) from product";
		return jdbcTemplate.queryForObject(sql, Long.class);
	}

	// single row with Generic Map
	public Map<String, Object> findById(int id) {
		String sql = "select * from product where id=?";
		return jdbcTemplate.queryForMap(sql, id);
	}
	
	 public List<Map<String,Object>> findAll() { 
		 String sql = "select * from PRODUCT";
		 return jdbcTemplate.queryForList(sql);
	 }
	 
	 // RowMapper interface for single row only.....
	 public Product findproductById(int id) {
		 String qry="select * from product where id=?";
		 return jdbcTemplate.queryForObject(qry,new RowMapperDemo(),id);
	 }
	 
	 // RowMapper interface for multi rows
	 public List<Product> findAllProducts(){
		 String qry="select * from product";
		 return jdbcTemplate.query(qry, new RowMapperForMultiColumnsDemo());
	 }
	 
	 
	 // RowCallbackHandler 
	 /*
	    Spring provides a simpler RowCallbackHandler interface when there is no return object
			– Streaming rows to a file
			– Converting rows to XML
			– Filtering rows before adding to a Collection
				• but filtering in SQL is much more efficient 
			– Faster than JPA equivalent for big queries
				• avoids result-set to object mapping
	  */
	 
	 
	 //ResultsetExtractor with multiple rows - query method
	 /*
	  
	  Spring provides a ResultSetExtractor interface for processing an entire ResultSet at once
		– You are responsible for iterating the ResultSet
		– e.g. for mapping entire ResultSet to a single object
	  */
	 
	 
	 @Transactional(isolation = Isolation.READ_UNCOMMITTED)
	 public List<Product> findProductsByResultsetExtractor() {
		return jdbcTemplate.query("select * from product", new ResultSetExtractorDemo());
	 }
	 
}

class ResultSetExtractorDemo implements ResultSetExtractor<List<Product>>{
	List<Product> products=new ArrayList<>();
	@Override
	public List<Product> extractData(ResultSet rs) throws SQLException, DataAccessException {
		
		while(rs.next()) {
			Product product=new Product();
			product.setId(rs.getInt("id"));
			product.setName(rs.getString("name"));
			product.setPrice(rs.getDouble("price"));
			product.setDescription(rs.getString("description"));
			products.add(product);
		}
		
		
		return products;
	}
}


class RowMapperForMultiColumnsDemo implements RowMapper<Product>{
	
	public Product mapRow(ResultSet rs, int rowNum) throws SQLException {
		Product product=new Product();
		product.setId(rs.getInt("id"));
		product.setName(rs.getString("name"));
		product.setPrice(rs.getDouble("price"));
		product.setDescription(rs.getString("description"));
		return product;
	}
}

class RowMapperDemo implements RowMapper<Product>{
	public Product mapRow(ResultSet rs, int rowNum) throws SQLException {
		Product product=new Product();
		product.setId(rs.getInt("id"));
		product.setName(rs.getString("name"));
		product.setPrice(rs.getDouble("price"));
		product.setDescription(rs.getString("description"));
		return product;
	}
}
