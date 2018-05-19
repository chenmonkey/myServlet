package tools;

import java.sql.Connection;
import java.sql.SQLException;

import org.apache.tomcat.jdbc.pool.DataSource;
import org.apache.tomcat.jdbc.pool.PoolProperties;

public class DBManager {
	private static DataSource datasource;
	public static DBManager INSTANCE;
	
	static{
		INSTANCE=new DBManager();
		setupJdbcPool();

	}
	//获取数据库连接
		public Connection getConnection(){
			Connection conn=null;
			try{
				conn=datasource.getConnection();
			
			}catch(SQLException e){
				e.printStackTrace();
			}
			return conn;
		}
	private static void setupJdbcPool() {
		PoolProperties p = new PoolProperties();
		p.setDriverClassName("org.postgresql.Driver");
		p.setUrl("jdbc:postgresql://localhost:5432/postgres");
		p.setUsername("postgres");
		p.setPassword("207913");
		p.setMaxActive(100);
		p.setInitialSize(10);
		p.setMaxWait(10000);
		p.setMaxIdle(50);
		p.setMinIdle(10);
		p.setDefaultAutoCommit(true);
		datasource = new DataSource();
		datasource.setPoolProperties(p);
		
	}

	//关闭数据库连接
	public void closeConnection(Connection conn){
		try{
			if(conn!=null)
				conn.close();
		}catch(SQLException e){
			e.printStackTrace();
		}
	}

	}