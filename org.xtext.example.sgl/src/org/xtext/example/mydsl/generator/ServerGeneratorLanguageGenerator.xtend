/*
 * generated by Xtext
 */
package org.xtext.example.mydsl.generator

import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.IGenerator
import org.eclipse.xtext.generator.IFileSystemAccess
import org.xtext.example.mydsl.serverGeneratorLanguage.Entity
import org.xtext.example.mydsl.serverGeneratorLanguage.Server
import org.xtext.example.mydsl.serverGeneratorLanguage.DomainModel

/**
 * Generates code from your model files on save.
 * see http://www.eclipse.org/Xtext/documentation.html#TutorialCodeGeneration
 */
class ServerGeneratorLanguageGenerator implements IGenerator {
	
	override void doGenerate(Resource resource, IFileSystemAccess fsa) {

		for(s: resource.allContents.toIterable.filter(typeof(Server))) {
		    fsa.generateFile("sgl.properties",
		    	s.compileServer)
		    }
		for(e: resource.allContents.toIterable.filter(typeof(Entity))) {
		    	fsa.generateFile(
		    	"src"+"/"+"com"+"/"+"pallyup"+"/"+"sgl"+"/"+"core"+"/"+"entity"+"/"+ //package "com.pallyup.sgl.core.entity"
		    	e.name.toFirstUpper + ".java", //class name
		    	e.compileEntity)
		    }
		for(e: resource.allContents.toIterable.filter(typeof(Entity))) {
		    	fsa.generateFile(
		    	"src"+"/"+"com"+"/"+"pallyup"+"/"+"sgl"+"/"+"server"+"/"+"resource"+"/"+ //package "com.pallyup.sgl.server.resource"
		    	e.name.toFirstUpper+"Resource"+".java", //class name
		    	e.compileEntityResource)
		    }
		for(e: resource.allContents.toIterable.filter(typeof(Entity))) {
		    	fsa.generateFile(
		    	"src"+"/"+"com"+"/"+"pallyup"+"/"+"sgl"+"/"+"server"+"/"+"resource"+"/"+ //package "com.pallyup.sgl.server.resource"
		    	e.name.toFirstUpper+"sResource"+".java", //class name
		    	e.compileEntitysResource)
			}
		for(d: resource.allContents.toIterable.filter(typeof(DomainModel))) {
		    	fsa.generateFile(
		    	"src"+"/"+"com"+"/"+"pallyup"+"/"+"sgl"+"/"+"server"+"/"+ //package "com.pallyup.sgl.server"
		    	"SGLServerApplication.java", //class name
		    	d.compileSGLServerApplication)
			}
		for(e: resource.allContents.toIterable.filter(typeof(DomainModel))) {
		    	fsa.generateFile(
		    	"src"+"/"+"com"+"/"+"pallyup"+"/"+"sgl"+"/"+"core"+"/"+"entity"+"/"+"dao"+"/"+ //package "com.pallyup.sgl.core.entity.dao"
		    	"SGLResourceMapper"+".java", //class name
		    	e.compileSGLResourceMapper)
			}
		for(e: resource.allContents.toIterable.filter(typeof(DomainModel))) {
		    	fsa.generateFile(
		    	"src"+"/"+"com"+"/"+"pallyup"+"/"+"sgl"+"/"+"server"+"/"+ //package "com.pallyup.sgl.server"
		    	"SGLServerMain"+".java", //class name
		    	e.compileSGLServerMain)
			}
		for(e: resource.allContents.toIterable.filter(typeof(DomainModel))) {
		    	fsa.generateFile(
		    	"src"+"/"+"com"+"/"+"pallyup"+"/"+"sgl"+"/"+"server"+"/"+ //package "com.pallyup.sgl.server"
		    	"SGLServerConstants"+".java", //class name
		    	e.compileSGLServerConstants)
			}
		for(e: resource.allContents.toIterable.filter(typeof(Entity))) {
		    	fsa.generateFile("src"+"/"+"com"+"/"+"pallyup"+"/"+"sgl"+"/"+"core"+"/"+"entity"+"/"+"dao"+"/"+ //package "com.pallyup.sgl.core.entity.dao"
		    	e.name.toFirstUpper+"Dao"+".java", //class name
		    	e.compileSGLEntityDao)
			}
		
		fsa.generateFile("src"+"/"+"com"+"/"+"pallyup"+"/"+"sgl"+"/"+"core"+"/"+"data"+"/"+ //package "com.pallyup.sgl.core.data"
		    	"SGLSqlProvider.java", //class name
		    	compileSGLSqlProvider)
		fsa.generateFile("src"+"/"+"com"+"/"+"pallyup"+"/"+"sgl"+"/"+"core"+"/"+"entity"+"/"+"dao"+"/"+ //package "com.pallyup.sgl.core.entity.dao"
		    	"DaoOptions.java", //class name
		    	compileDaoOptions)
		fsa.generateFile("src"+"/"+"com"+"/"+"pallyup"+"/"+"sgl"+"/"+"core"+"/"+"entity"+"/"+"dao"+"/"+ //package "com.pallyup.sgl.core.entity.dao"
		    	"SGLDaoException.java", //class name
		    	compileSGLDaoException)
		fsa.generateFile("src"+"/"+"com"+"/"+"pallyup"+"/"+"sgl"+"/"+"core"+"/"+"util"+"/"+ //package "com.pallyup.sgl.core.util"
		    	"CommonUtils.java", //class name
		    	compileCommonUtils)
		fsa.generateFile("src"+"/"+"com"+"/"+"pallyup"+"/"+"sgl"+"/"+"server"+"/"+"core"+"/"+ //package "com.pallyup.sgl.server.core"
		    	"Result.java", //class name
		    	compileResult)
			
	}
	
	def compileServer(Server s) ''' 
    #jetty or jse
    sgl.www.server=jetty
    �FOR c:s.configs�
    	�IF c.eClass.name.contentEquals('rootConfig')�sgl.www.rootdir=�c.name.removeQuote()��ENDIF�
    	�IF c.eClass.name.contentEquals("hostNameConfig")�sgl.www.hostname=�c.name.removeQuote()��ENDIF�
    	�IF c.eClass.name.contentEquals('portConfig')�sgl.www.port=�c.name.removeQuote()��ENDIF�
    	�IF c.eClass.name.contentEquals('logConfig')�sgl.www.log=�c.name.removeQuote()��ENDIF�
    	�IF c.eClass.name.contentEquals('sqldbConfig')�sgl.www.sqlitedb=�c.name.removeQuote()��ENDIF�
    	�IF c.eClass.name.contentEquals('resourceConfig')�sgl.www.<table_name>s_images=�c.name.removeQuote()��ENDIF�
    �ENDFOR�
	'''
	
	def removeQuote(String inp){
		inp.subSequence(1, inp.length-1)
	}
	
	def toJavaType(String inp){
		switch (inp) {
			case "NumberAttribute" : "int"
			case "StringAttribute" : "String"
			case "ImageAttribute" : "String"
			default : ""
		}
	}
	
	def outputAllExceptId(Entity e) {
		var String output = '''�FOR a:e.attributes SEPARATOR ', '��IF a.name.contentEquals('id0')��ELSE��a.eClass.name.toJavaType()� �a.name��ENDIF��ENDFOR�'''
		output.substring(2)
	}

	def outputAllExceptId2(Entity e) {
		var String output = '''�FOR a:e.attributes SEPARATOR ', '��IF a.name.contentEquals('id0')��ELSE��a.name��ENDIF��ENDFOR�'''
		output.substring(2)
	}
	
	def outputSetAll(Entity e) {
		var String output = '''�FOR a:e.attributes SEPARATOR ', '��IF a.name.contentEquals('id0')��ELSE��a.name�=?�ENDIF��ENDFOR�'''
		output.substring(2)
	}
	
	def outputAllQmarkExceptId(Entity e) {
		var String output = '''�FOR a:e.attributes SEPARATOR ', '��IF a.name.contentEquals('id0')��ELSE�?�ENDIF��ENDFOR�'''
		output.substring(2)
	}
	
	def compileEntity(Entity e) '''
	package com.pallyup.sgl.core.entity;

	import java.util.ArrayList;
	 
	 
	public class �e.name.toFirstUpper� {
		private int id;
		�FOR a:e.attributes�
			�IF a.name.contentEquals('id0')�
			�ELSE�
				private �a.eClass.name.toJavaType()� �a.name�;
			�ENDIF�
		�ENDFOR�
	 
	 
		public �e.name.toFirstUpper�(){}
	
		public �e.name.toFirstUpper�(�outputAllExceptId(e)�){
			super();
			�FOR a:e.attributes�
				�IF a.name.contentEquals('id0')��ELSE�this.�a.name� = �a.name�;�ENDIF�
			�ENDFOR�
		}
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		�FOR a:e.attributes��IF a.name.contentEquals('id0')��ELSE�
		public �a.eClass.name.toJavaType()� get�a.name.toFirstUpper�() {
			return �a.name�;
		}
		public void set�a.name.toFirstUpper�(�a.eClass.name.toJavaType()� �a.name�) {
			this.�a.name� = �a.name�;
		}�ENDIF�
		�ENDFOR�
		@Override
		public String toString() {
			return "{�e.name.toFirstUpper�:id=" + id + "�FOR a:e.attributes��IF a.name.contentEquals('id0')��ELSE��a.name�=" + �a.name� + "�ENDIF��ENDFOR�}";
		}
	
		public static �e.name.toFirstUpper�s collectionInstance(){
			return new �e.name.toFirstUpper�s();
		}
		public static class �e.name.toFirstUpper�s extends ArrayList<�e.name.toFirstUpper�> {
			private static final long serialVersionUID = 1L;
		}
	}
		''' 
		
	def compileEntityResource(Entity e) '''
	package com.pallyup.sgl.server.resource;

	import java.util.logging.Level;
	import java.util.logging.Logger;

	import org.restlet.data.Status;
	import org.restlet.resource.Get;
	import org.restlet.resource.ServerResource;
	
	import com.pallyup.sgl.server.core.Result;
	import com.pallyup.sgl.core.entity.�e.name.toFirstUpper�;
	import com.pallyup.sgl.core.entity.dao.�e.name.toFirstUpper�Dao;
	import com.pallyup.sgl.core.entity.dao.SGLDaoException;

	public class �e.name.toFirstUpper�Resource extends ServerResource {

	private static Logger LOGGER = Logger.getLogger(�e.name.toFirstUpper�Resource.class.getSimpleName());
	
	private static final String ATTR_�e.name.toUpperCase�_ID = "�e.name.toFirstUpper�_id";

	public static final String ENDPOINT = �e.name.toFirstUpper�Resource.ENDPOINT + "/{" + ATTR_�e.name.toUpperCase�_ID + "}";
	
	@Get
	public Object get�e.name.toFirstUpper�ById() {
		Result result = new Result();
		
		String id = (String) this.getRequest().getAttributes().get(ATTR_�e.name.toUpperCase�_ID);

		try {
			if(id==null || id.length()==0)
				throw new IllegalArgumentException();
			
			try {
				LOGGER.log(Level.INFO, "Processing get�e.name.toFirstUpper�ById for id: " + id);
				�e.name.toFirstUpper� �e.name� = �e.name.toFirstUpper�Dao.get�e.name.toFirstUpper�(Integer.parseInt(id));
				result.setStatus(Result.Status.OK);
				if(�e.name�!=null){
					result.setData(�e.name�);
					getResponse().setStatus(Status.SUCCESS_OK);
				}
				else{
					result.setError("�e.name.toFirstUpper� not found", Status.CLIENT_ERROR_NOT_FOUND.getCode());
					getResponse().setStatus(Status.CLIENT_ERROR_NOT_FOUND);
				}
			} catch(NumberFormatException e){
				throw new IllegalArgumentException(e);
			}
		} catch(SGLDaoException e){
			LOGGER.log(Level.SEVERE, "A problem occured when processing get�e.name.toFirstUpper�ById for id: " + id, e);
			result.setError("The server encountered a problem. Try again later.", Status.SERVER_ERROR_INTERNAL.getCode());
			getResponse().setStatus(Status.SERVER_ERROR_INTERNAL);
		} catch (IllegalArgumentException e){
			LOGGER.log(Level.WARNING,"Invalid �e.name.toFirstUpper� ID passed as request parameter.");
			result.setError("Invalid argument specified.", Status.CLIENT_ERROR_BAD_REQUEST.getCode());
			getResponse().setStatus(Status.CLIENT_ERROR_BAD_REQUEST);
		} catch (Exception e){
			LOGGER.log(Level.SEVERE, "A problem occured when processing get�e.name.toFirstUpper�ById for id: " + id, e);
			result.setError("The server encountered a problem. Try again later.", Status.SERVER_ERROR_INTERNAL.getCode());
			getResponse().setStatus(Status.SERVER_ERROR_INTERNAL);
		} 
		return result;		
	}
}
	'''

	def compileEntitysResource(Entity e) '''
	package com.pallyup.sgl.server.resource;

	import java.util.logging.Level;
	import java.util.logging.Logger;
	
	import org.restlet.data.Status;
	import org.restlet.resource.Get;
	import org.restlet.resource.ServerResource;
	
	import com.pallyup.sgl.core.entity.�e.name.toFirstUpper�.�e.name.toFirstUpper�s;
	import com.pallyup.sgl.core.entity.dao.�e.name.toFirstUpper�Dao;
	import com.pallyup.sgl.core.entity.dao.SGLDaoException;
	import com.pallyup.sgl.server.core.Result;
	
	public class �e.name.toFirstUpper�sResource extends ServerResource {
		
		private static Logger LOGGER = Logger.getLogger(�e.name.toFirstUpper�sResource.class.getSimpleName());
		
		public static final String ENDPOINT = "/�e.name�s";
		
		@Get
		public Object get�e.name.toFirstUpper�s() {
			Result result = new Result();
			
			try {
					LOGGER.log(Level.INFO, "Processing get�e.name.toFirstUpper�s");
					
					�e.name.toFirstUpper�s �e.name�s = �e.name.toFirstUpper�Dao.get�e.name.toFirstUpper�s();
					
					result.setStatus(Result.Status.OK);
					
					result.setData(�e.name�s);
					
					getResponse().setStatus(Status.SUCCESS_OK);
					
			} catch(SGLDaoException e){
				LOGGER.log(Level.SEVERE, "A problem occured when processing get�e.name.toFirstUpper�s");
				result.setError("The server encountered a problem. Try again later.", Status.SERVER_ERROR_INTERNAL.getCode());
				getResponse().setStatus(Status.SERVER_ERROR_INTERNAL);
			} catch (Exception e){
				LOGGER.log(Level.SEVERE, "A problem occured when processing get�e.name.toFirstUpper�s");
				result.setError("The server encountered a problem. Try again later.", Status.SERVER_ERROR_INTERNAL.getCode());
				getResponse().setStatus(Status.SERVER_ERROR_INTERNAL);
			} 
			return result;
		}
	}

	'''

	def returnType(String inp) {
		switch (inp) {
			case "NumberAttribute" : "Int"
			case "StringAttribute" : "String"
			case "ImageAttribute" : "String"
			default : ""
		}
	}
	
	def compileSGLEntityDao(Entity e) '''
	package com.pallyup.sgl.core.entity.dao;
	
	import java.sql.PreparedStatement;
	import java.sql.ResultSet;
	import java.sql.SQLException;
	import java.util.logging.Level;
	import java.util.logging.Logger;
	
	import com.pallyup.sgl.core.data.SGLSqlProvider;
	import com.pallyup.sgl.core.entity.�e.name.toFirstUpper�;
	import com.pallyup.sgl.core.entity.�e.name.toFirstUpper�.�e.name.toFirstUpper�s;
	
	public class �e.name.toFirstUpper�Dao {
		private static Logger LOGGER = Logger.getLogger(�e.name.toFirstUpper�Dao.class.getSimpleName());
		
		private static final int MAX_BATCH_SIZE = 20;
		
		public static final String TABLE_NAME = "�e.name�s";
		
		private static final String SELECT_ALL = "SELECT id, �e.outputAllExceptId2� FROM " + TABLE_NAME;
		private static final String SELECT_BY_ID = SELECT_ALL + " WHERE id=?";
		
		private static final String INSERT = "INSERT INTO " + TABLE_NAME + "(�e.outputAllExceptId2�) VALUES(�e.outputAllQmarkExceptId�)";
		
		private static final String UPDATE = "UPDATE " + TABLE_NAME + " SET �e.outputSetAll� WHERE id=?";
		
		private static final String DELETE_ALL = "DELETE FROM " + TABLE_NAME;
		private static final String DELETE_BY_ID = DELETE_ALL + " WHERE id=?";
		
		public static �e.name.toFirstUpper�s get�e.name.toFirstUpper�s() {
			�e.name.toFirstUpper�s �e.name�s = �e.name.toFirstUpper�.collectionInstance();
			try {
				PreparedStatement st = SGLSqlProvider.getPreparedStatement(SELECT_ALL);
	
				ResultSet rs = st.executeQuery();
	
				�e.name.toFirstUpper� �e.name�;
				while (rs.next()) {
					�e.name� = new �e.name.toFirstUpper�();
					�FOR a:e.attributes�
						�IF a.name.contentEquals('id0')�
							�e.name�.setId(rs.getInt("id"));
						�ELSE�
							�e.name�.set�a.name.toFirstUpper�(rs.get�a.eClass.name.returnType�("�a.name�"));
						�ENDIF�
					�ENDFOR�
					�e.name�s.add(�e.name�);
				}
				rs.close();
				st.close();
			} catch (SQLException e) {
				LOGGER.log(Level.SEVERE, "(SQL ERROR CODE: " + e.getErrorCode() + ") Dao could not complete get�e.name.toFirstUpper�s for " + SELECT_ALL, e);
				throw new SGLDaoException(e.getMessage(), e);
			}
			return �e.name�s;
		}
	
		public static �e.name.toFirstUpper� get�e.name.toFirstUpper�(int id) {
			
			if(id<0){
				throw new IllegalArgumentException("Invalid �e.name.toFirstUpper� ID: �e.name.toFirstUpper� ID cannot be negative");
			}
			
			�e.name.toFirstUpper� �e.name� = new �e.name.toFirstUpper�();
			�e.name�.setId(id);
			
			try {
	
				PreparedStatement prep = SGLSqlProvider.getPreparedStatement(SELECT_BY_ID);
			
				prep.setInt(1, �e.name�.getId());
	
				ResultSet rs = prep.executeQuery();
				if (rs.next()) {
					�FOR a:e.attributes�
						�IF a.name.contentEquals('id0')��ELSE��e.name�.set�a.name.toFirstUpper�(rs.get�a.eClass.name.returnType�("�a.name�"));�ENDIF�
					�ENDFOR�
				} else {
					�e.name� = null;
				}
				
			} catch (SQLException e) {
				LOGGER.log(Level.SEVERE, "(SQL ERROR CODE: " + e.getErrorCode() + ") Dao could not complete get�e.name.toFirstUpper� for " + SELECT_BY_ID, e);
				throw new SGLDaoException(e.getMessage(), e);
			}
			return �e.name�;	
		}
	
		public static int create�e.name.toFirstUpper�(�e.name.toFirstUpper� �e.name�) {
			
			if(�e.name�==null){
				throw new IllegalArgumentException("Invalid �e.name.toFirstUpper� Object: Cannot persist null object");
			}
			
			int generatedKey = -1;
			try {
				PreparedStatement prep = SGLSqlProvider.getPreparedStatement(INSERT);
				�FOR a:e.attributes�
					�IF a.name.contentEquals('id0')��ELSE�//prep.set�a.eClass.name.returnType�([note:num], �e.name�.get�a.name.toFirstUpper�());�ENDIF�
				�ENDFOR�
				prep.execute();
				
				ResultSet generatedKeys = prep.getGeneratedKeys();
				
				if (generatedKeys.next()) {
		            generatedKey = (int) generatedKeys.getLong(1);
		        } else {
		            throw new SQLException("Creating �e.name� failed, no generated key obtained.");
		        }
			}
			catch (SQLException e) {
				LOGGER.log(Level.SEVERE, "(SQL ERROR CODE: " + e.getErrorCode() + ") Dao could not complete create�e.name.toFirstUpper� for " + INSERT + " and �e.name�s " + �e.name�, e);
				throw new SGLDaoException(e.getMessage(), e);
			}
			return generatedKey;
		}
		
		public static void create�e.name.toFirstUpper�(�e.name.toFirstUpper�s �e.name�s){
	
			if(�e.name�s==null){
				throw new IllegalArgumentException("Invalid �e.name.toFirstUpper�s Object: Cannot persist null object");
			}
			
			PreparedStatement prep = SGLSqlProvider.getPreparedStatement(INSERT);
			try {
				prep.getConnection().setAutoCommit(false);
				�e.name.toFirstUpper� �e.name�;
				for (int i=0; i<�e.name�s.size(); i++){
					�e.name� = �e.name�s.get(i);
					�FOR a:e.attributes�
						�IF a.name.contentEquals('id0')�prep.setInt(1, �e.name�.getId());�ELSE�//prep.set�a.eClass.name.returnType�([note:num], �e.name�.get�a.name.toFirstUpper�());�ENDIF�
					�ENDFOR�
					prep.addBatch();
					//�e.name� has reached batch size or �e.name� size is complete
					if( (i%MAX_BATCH_SIZE)==0 || i==�e.name�s.size()-1){
						prep.executeBatch();
						ResultSet generatedKeys = prep.getGeneratedKeys();
						while(generatedKeys.next()){
							long id = generatedKeys.getLong(1);
							System.out.println(id);
						}
					}
				}
				prep.getConnection().setAutoCommit(true);
				LOGGER.info("Executing SQL insert for" + �e.name�s);
			} catch (SQLException e) {
				LOGGER.log(Level.SEVERE, "(SQL ERROR CODE: " + e.getErrorCode() + ") Dao could not complete create�e.name.toFirstUpper�s for " + INSERT + " and �e.name�s " + �e.name�s, e);
				throw new SGLDaoException(e.getMessage(), e);
			}
		}
		
		public static void update�e.name.toFirstUpper�(�e.name.toFirstUpper� �e.name�) {
	
			if(�e.name�==null){
				throw new IllegalArgumentException("Invalid �e.name.toFirstUpper� Object: Cannot persist null object");
			}
			
			PreparedStatement prep = SGLSqlProvider.getPreparedStatement(UPDATE);
			try {
				�FOR a:e.attributes�
					�IF a.name.contentEquals('id0')��ELSE�//prep.set�a.eClass.name.returnType�([note:num], �e.name�.get�a.name.toFirstUpper�());�ENDIF�
				�ENDFOR�
				int result = prep.executeUpdate();
				LOGGER.info(result + " rows were affected when executing " + UPDATE + " with param " + �e.name�);
			} catch (SQLException e) {
				LOGGER.log(Level.SEVERE, "(SQL ERROR CODE: " + e.getErrorCode() + ") Dao could not complete update�e.name.toFirstUpper� for " + UPDATE + " and �e.name� " + �e.name�, e);
				throw new SGLDaoException(e.getMessage(), e);
			}
		}
	
		public static void delete�e.name.toFirstUpper�(int id) {
	
			if(id<0){
				throw new IllegalArgumentException("Invalid �e.name.toFirstUpper� ID: �e.name.toFirstUpper� ID cannot be negative");
			}
			
			try {
				PreparedStatement prep = SGLSqlProvider.getPreparedStatement(DELETE_BY_ID);
				prep.setInt(1, id);
				int result = prep.executeUpdate();
				LOGGER.info(result + " rows were affected when executing " + DELETE_BY_ID + " with param " + id);
			} catch (SQLException e) {
				LOGGER.log(Level.SEVERE, "(SQL ERROR CODE: " + e.getErrorCode() + ") Dao could not complete delete�e.name.toFirstUpper� for " + DELETE_BY_ID, e);
				throw new SGLDaoException(e.getMessage(), e);
			}
		}
		
		/*public static void deleteAll�e.name.toFirstUpper�s(){
			try {
				PreparedStatement prep = SGLSqlProvider.getPreparedStatement(DELETE_ALL);
				int result = prep.executeUpdate();
				LOGGER.info(result + " rows were affected when executing " + DELETE_ALL);
			} catch (SQLException e) {
				LOGGER.log(Level.SEVERE, "(SQL ERROR CODE: " + e.getErrorCode() + ") Dao could not complete deleteAll�e.name.toFirstUpper�s for " + DELETE_ALL, e);
				throw new SGLDaoException(e.getMessage(), e);
			}
		}*/
	}

	'''

	def compileSGLServerApplication(DomainModel d) '''
	package com.pallyup.sgl.server;
	
	import java.util.logging.Logger;
	
	import org.restlet.Application;
	import org.restlet.Restlet;
	import org.restlet.resource.Directory;
	import org.restlet.routing.Router;
	
	�FOR e:d.entitys�
			import com.pallyup.sgl.server.resource.�e.name.toFirstUpper�Resource;
			import com.pallyup.sgl.server.resource.�e.name.toFirstUpper�sResource;
	�ENDFOR�
	
	public class SGLServerApplication extends Application implements SGLServerConstants {
	
		private static Logger LOGGER = Logger.getLogger(SGLServerMain.class.getSimpleName());
		private String wwwRootDir;
		
		public SGLServerApplication(String rootDir){
			this.wwwRootDir = rootDir;
		}
		
	    /**
	     * Creates a root Restlet that will receive all incoming calls.
	     */
	    @Override
	    public synchronized Restlet createInboundRoot() {
	        
	    	Router router = new Router(getContext());
	            	
	    	//attach static web files to "www" folder
	        Directory dir = new Directory(getContext(),this.wwwRootDir);
	        dir.setListingAllowed(true);
	        dir.setDeeplyAccessible(true);
	        
	    	�FOR e:d.entitys�
	    		// ENDPOINT = /�e.name�s
	    		LOGGER.info("Attaching endpoint for " + �e.name.toFirstUpper�sResource.class.getSimpleName() + ": " + �e.name.toFirstUpper�sResource.ENDPOINT);
	    		router.attach(�e.name.toFirstUpper�sResource.ENDPOINT, �e.name.toFirstUpper�sResource.class);
	    		
	    		// ENDPOINT = /�e.name�s/{�e.name�_id}
	    		LOGGER.info("Attaching endpoint for " + �e.name.toFirstUpper�Resource.class.getSimpleName() + ": " + �e.name.toFirstUpper�Resource.ENDPOINT);
	    		router.attach(�e.name.toFirstUpper�Resource.ENDPOINT, �e.name.toFirstUpper�Resource.class);
			�ENDFOR�
	        
	        // ENDPOINT = /
	        LOGGER.info("Attaching static html endpoint: " + this.wwwRootDir);
	        router.attach("/",dir);
	        
	        return router;
	    }
	
	}
	'''

	def compileSGLResourceMapper(DomainModel d) '''
	package com.pallyup.sgl.core.entity.dao;
	
	import com.pallyup.sgl.server.SGLServerMain;
	
	public class SGLResourceMapper {
		//public static String get<<e.name>>s<<a.name.toFirstUpper>>(int <<e.name>>Id){
		//	return "http://" + SGLServerMain.getExternalHostAddress() + ":" + SGLServerMain.getExternalHostPort() + "/images/sales/<<e.name>><<a.name.toFirstUpper>>" + <<e.name>>Id + ".gif";
		//}
	�FOR e:d.entitys�
		�FOR a:e.attributes�
			�IF a.eClass.name.contentEquals('ImageAttribute')�
					public static String get�e.name.toFirstUpper�s�a.name.toFirstUpper�(int �e.name�sId){
						//SGLServerMain.get�e.name.toFirstUpper�sImagesDirectory();
						return "http://" + SGLServerMain.getExternalHostAddress() + ":" + SGLServerMain.getExternalHostPort() + "/images/�e.name�s/�e.name.toFirstUpper�s_�a.name.toFirstUpper�_" + �e.name�sId + ".gif";
					}
				�ENDIF�
		�ENDFOR�
	�ENDFOR�
		}
		
	'''

	def compileSGLServerMain(DomainModel d) '''
	package com.pallyup.sgl.server;
	
	import java.io.IOException;
	import java.net.URL;
	import java.util.NoSuchElementException;
	import java.util.logging.FileHandler;
	import java.util.logging.Level;
	import java.util.logging.Logger;
	
	import org.apache.commons.configuration.Configuration;
	import org.apache.commons.configuration.ConfigurationException;
	import org.apache.commons.configuration.PropertiesConfiguration;
	import org.restlet.Component;
	import org.restlet.Server;
	import org.restlet.data.Protocol;
	import org.restlet.ext.jetty.AjpServerHelper;
	import org.restlet.ext.jetty.HttpServerHelper;
	import org.restlet.ext.jetty.JettyServerHelper;
	import org.restlet.service.LogService;
	
	public class SGLServerMain implements SGLServerConstants {
	
		private static final Logger LOGGER = Logger
				.getLogger(SGLServerMain.class.getSimpleName());
	
		private static String _CONFIG_WWW_ROOT_DIR_URI;
		private static String _CONFIG_WWW_LOG;
		private static int _CONFIG_WWW_PORT;
		private static String _CONFIG_WWW_SQLITE_DB;
		private static String _CONFIG_WWW_HOSTNAME;
		private static String _CONFIG_WWW_SERVER;
		�FOR e:d.entitys�
			�FOR a:e.attributes�
				�IF a.eClass.name.contentEquals('ImageAttribute')�
					//private static String _CONFIG_WWW_�e.name.toUpperCase�_IMAGES;
				�ENDIF�
			�ENDFOR�
		�ENDFOR�
		public static void loadServerProperties(String[] args)
				throws ConfigurationException, NoSuchElementException {
			// Load properties file
			Configuration config;
			if (args.length == 1) {
				LOGGER.info("Attempting to load properties from specified file passed through args...");
				config = new PropertiesConfiguration(args[0]);
			} else {
				LOGGER.info("Attempting to load default properties file (sgl.properties).");
				config = new PropertiesConfiguration(
						SGLServerConstants.CONFIG_DEFAULT_FILE);
			}
	
			_CONFIG_WWW_ROOT_DIR_URI = config
					.getString(SGLServerConstants.CONFIG_WWW_ROOT_DIR_URI);
			_CONFIG_WWW_LOG = config
					.getString(SGLServerConstants.CONFIG_WWW_LOG);
			_CONFIG_WWW_PORT = config
					.getInt(SGLServerConstants.CONFIG_WWW_PORT);
			_CONFIG_WWW_SQLITE_DB = config
					.getString(SGLServerConstants.CONFIG_WWW_SQLITE_DB);
			_CONFIG_WWW_HOSTNAME = config
					.getString(SGLServerConstants.CONFIG_WWW_HOSTNAME);
			_CONFIG_WWW_SERVER = config
					.getString(SGLServerConstants.CONFIG_WWW_SERVER);
			�FOR e:d.entitys�
				�FOR a:e.attributes�
					�IF a.eClass.name.contentEquals('ImageAttribute').booleanValue�
						//_CONFIG_WWW_�e.name.toUpperCase�_IMAGES = config
						//.getString(SGLServerConstants.CONFIG_WWW_�e.name.toUpperCase�_IMAGES);
					�ENDIF�
				�ENDFOR�
			�ENDFOR�
	
			if (_CONFIG_WWW_ROOT_DIR_URI == null || _CONFIG_WWW_LOG == null
					|| _CONFIG_WWW_SQLITE_DB == null
					|| _CONFIG_WWW_HOSTNAME == null
			�FOR e:d.entitys�
				�FOR a:e.attributes�
					�IF a.eClass.name.contentEquals('ImageAttribute').booleanValue�
						//|| _CONFIG_WWW_�e.name.toUpperCase�_IMAGES == null
					�ENDIF�
				�ENDFOR�
			�ENDFOR�
					|| _CONFIG_WWW_SERVER == null) {
				throw new NoSuchElementException(
						"Required parameters not defined in the specified properties file.");
			}
		}
	
		private static void initiliaseComponent(Component serverComponent)
				throws SecurityException, IOException {
			// Add support for serving files
			serverComponent.getClients().add(Protocol.FILE);
	
			SGLServerApplication sglServer = new SGLServerApplication(
					"file://" + _CONFIG_WWW_ROOT_DIR_URI);
	
			serverComponent.getDefaultHost().attach(sglServer);
	
			LOGGER.info("Finished initialising component");
		}
	
		private static void initialiseLogging(Component serverComponent)
				throws SecurityException, IOException {
			// setup logging
			LogService logService = serverComponent.getLogService();
			logService.setEnabled(true);
			logService.setLoggerName("com.naviquan");
			logService
					.setLogFormat("{cia} {m} {S} {rp}     AGENT:{cig}    REF:{fp}");
	
			FileHandler fh = new FileHandler(_CONFIG_WWW_LOG, true);
			LOGGER.addHandler(fh);
			LOGGER.setUseParentHandlers(true);
	
		}
	
		private static void loadJseServer(Component serverComponent)
				throws Exception {
			// Start the component.
			LOGGER.info("Starting " + SGLServerMain.class.getSimpleName()
					+ " component using JSE SERVER");
	
			serverComponent.getServers().add(Protocol.HTTP, _CONFIG_WWW_PORT);
	
			// serverComponent.getContext().getParameters().add("maxThreads",
			// "512"); //TODO: Temporary solution to threads problem.
			// serverComponent.getContext().getParameters().add("maxTotalConnections",
			// "512");
			serverComponent.start();
		}
	
		private static void loadJettyServer(Component serverComponent)
				throws Exception {
			// Start the component
			LOGGER.info("Starting " + SGLServerMain.class.getSimpleName()
					+ " component using JETTY SERVER");
	
			// create embedding jetty server
			Server embedingJettyServer = new Server(serverComponent.getContext()
					.createChildContext(), Protocol.HTTP, _CONFIG_WWW_PORT,
					serverComponent);
	
			// construct and start JettyServerHelper
			JettyServerHelper jettyServerHelper = new HttpServerHelper(
					embedingJettyServer);
			LOGGER.info("**Starting Jetty Server with "
					+ jettyServerHelper.getMaxThreads() + " threads.**");
			jettyServerHelper.start();
	
			//fakes a call to the to allow initial server error (BindException).
			try {
				new URL("http://localhost:" + _CONFIG_WWW_PORT).openConnection().getInputStream().close();
			} catch (Exception e) {}
		}
	
		@SuppressWarnings("unused")
		private static void loadJettyAjpServer(Component serverComponent)
				throws Exception {
			// Start the component
			LOGGER.info("Starting " + SGLServerMain.class.getSimpleName()
					+ " component using JETTY AJP SERVER");
	
			// create embedding AJP Server
			Server embedingJettyAJPServer = new Server(serverComponent.getContext()
					.createChildContext(), Protocol.HTTP, 8183, serverComponent);
	
			// construct and start AjpServerHelper
			AjpServerHelper ajpServerHelper = new AjpServerHelper(
					embedingJettyAJPServer);
			LOGGER.info("**Starting Jetty Ajp Server with "
					+ ajpServerHelper.getMaxThreads() + " threads.**");
			ajpServerHelper.start();
	
		}
	
		public static String getSGLSqliteDbPath() {
			return _CONFIG_WWW_SQLITE_DB;
		}
	
		public static String getExternalHostAddress() {
			return _CONFIG_WWW_HOSTNAME;
		}
	
		public static int getExternalHostPort() {
			return _CONFIG_WWW_PORT;
		}
		�FOR e:d.entitys�
			�FOR a:e.attributes�
				�IF a.eClass.name.contentEquals('ImageAttribute').booleanValue�
					//public static String get�e.name.toFirstUpper�ImagesDirectory() {
					//	return _CONFIG_WWW_�e.name.toUpperCase�_IMAGES;
					//}
				�ENDIF�
			�ENDFOR�
		�ENDFOR�
		public static void main(String[] args) {
	
			// Load properties file ---
			boolean propertiesLoaded = false;
			StringBuffer sb = new StringBuffer();
			try {
				loadServerProperties(args);
				LOGGER.info("Successfully loaded properties file.");
				
				sb.append("\nRunning SGL Server with the following configuration:\n");
				sb.append("\tWWW SERVER : " + _CONFIG_WWW_SERVER + "\n");
				sb.append("\tWWW ROOT DIR: " + _CONFIG_WWW_ROOT_DIR_URI + "\n");
				sb.append("\tWWW LOG: " + _CONFIG_WWW_LOG + "\n");
				sb.append("\tWWW PORT: " + _CONFIG_WWW_PORT + "\n");
				sb.append("\tWWW SQLITE DB: " + _CONFIG_WWW_SQLITE_DB + "\n");
				sb.append("\tWWW HOSTNAME: " + _CONFIG_WWW_HOSTNAME + "\n");
				�FOR e:d.entitys�
					�FOR a:e.attributes�
						�IF a.eClass.name.contentEquals('ImageAttribute').booleanValue�
							//sb.append("\tWWW �e.name.toUpperCase� IMAGES: " + _CONFIG_WWW_�e.name.toUpperCase�_IMAGES + "\n");
						�ENDIF�
					�ENDFOR�
				�ENDFOR�
				LOGGER.info(sb.toString());
				propertiesLoaded = true;
			} catch (ConfigurationException e) {
				LOGGER.log(
						Level.SEVERE,
						"A Fatal Problem Occured. Could not start server (properties file was not loaded).",
						e);
			} catch (NoSuchElementException e) {
				LOGGER.log(
						Level.SEVERE,
						"A Fatal Problem Occured. Could not start server  (could not load required fields from properties file).",
						e);
			} finally {
				if (!propertiesLoaded)
					System.exit(0);
			}
	
			// Load server ---
			try {
				Component serverComponent = new Component();
				initiliaseComponent(serverComponent);
				initialiseLogging(serverComponent);
	
				if (_CONFIG_WWW_SERVER.equals("jetty"))
					loadJettyServer(serverComponent);
				else
					loadJseServer(serverComponent);
	
				LOGGER.info(sb.toString());
			} catch (IOException e) {
				LOGGER.log(Level.SEVERE, "A Fatal Problem Occured.", e);
			} catch (Exception e) {
				LOGGER.log(Level.SEVERE, "A Fatal Problem Occured.", e);
			}
		}
	}
		
	'''

	def compileSGLServerConstants(DomainModel d) '''
	package com.pallyup.sgl.server;

	public interface SGLServerConstants {
	public static final String CONFIG_DEFAULT_FILE = "sgl.properties";
	
	public static final String CONFIG_WWW_ROOT_DIR_URI = "sgl.www.rootdir";

	public static final String CONFIG_WWW_LOG = "sgl.www.log";
	
	public static final String CONFIG_WWW_PORT = "sgl.www.port";	

	public static final String CONFIG_WWW_SQLITE_DB = "sgl.www.sqlitedb";
	
	public static final String CONFIG_WWW_HOSTNAME = "sgl.www.hostname";

	public static final String CONFIG_WWW_SERVER = "sgl.www.server";
	�FOR e:d.entitys�
		�FOR a:e.attributes�
			�IF a.eClass.name.contentEquals('ImageAttribute')�
				//public static final String CONFIG_WWW_�e.name.toUpperCase�_IMAGES = "sgl.www.�e.name�_images";
			�ENDIF�
		�ENDFOR�
	�ENDFOR�
	}
	'''












	def compileSGLSqlProvider() '''
		package com.pallyup.sgl.core.data;
	
	import java.sql.Connection;
	import java.sql.DriverManager;
	import java.sql.PreparedStatement;
	import java.sql.SQLException;
	import java.sql.Statement;
	import java.util.logging.Level;
	import java.util.logging.Logger;
	
	import com.pallyup.sgl.core.entity.dao.SGLDaoException;
	import com.pallyup.sgl.server.SGLServerMain;
	
	public class SGLSqlProvider {
	
		private static Logger LOGGER = Logger.getLogger(SGLSqlProvider.class.getSimpleName());
		
		private static Connection CONNECTION;
			
		public static Connection getConnection() throws SQLException,
				ClassNotFoundException {
			if (CONNECTION == null) {
				Class.forName("org.sqlite.JDBC");
				CONNECTION = DriverManager.getConnection("jdbc:sqlite:"+SGLServerMain.getSGLSqliteDbPath());
				try {
					Statement stmt = CONNECTION.createStatement();
					
					boolean result  = stmt.execute("PRAGMA foreign_keys=ON;");
					
					LOGGER.info("(RESULT: " + result + ") Enabling Foreign Key Support - PRAGMA foreign_keys = on");
				} catch (SQLException e) {
					LOGGER.log(Level.SEVERE, "Failed to enable foreign key support");
					throw new SGLDaoException(e.getMessage(), e);
				}
			}
			return CONNECTION;
		}
		
		public static PreparedStatement getPreparedStatement(String sql){
			PreparedStatement st = null;
			try {
				st = SGLSqlProvider.getConnection().prepareStatement(sql);
			} catch (SQLException e) {
				LOGGER.severe(e.getClass() + ": Could not create PreparedStatement for " + sql + "\n" + e.getMessage());
			} catch (ClassNotFoundException e) {
				LOGGER.severe(e.getClass() + ": Possible problem with database driver.\n " + e.getMessage());
			}
			return st;	
		}
	}
		
		'''

	def compileDaoOptions() '''
	package com.pallyup.sgl.core.entity.dao;
	
	import java.util.HashMap;
	
	public class DaoOptions extends HashMap<String, Object> {
		
		/**
		 * 
		 */
		private static final long serialVersionUID = 1L;
	
		public DaoOptions(){
			
		}
	}
	
	'''

	def compileSGLDaoException() '''
	package com.pallyup.sgl.core.entity.dao;
	
	@SuppressWarnings("serial")
	public class SGLDaoException extends RuntimeException {
		public SGLDaoException() {
		}
	
		public SGLDaoException(String msg) {
			super(msg);
		}
	
		public SGLDaoException(Throwable cause) {
			super(cause);
		}
	
		public SGLDaoException(String msg, Throwable cause) {
			super(msg, cause);
		}
	}
	
	'''

	def compileCommonUtils() '''
	package com.pallyup.sgl.core.util;
	
	import java.awt.Color;
	import java.awt.Graphics2D;
	import java.awt.Image;
	import java.awt.image.BufferedImage;
	import java.io.ByteArrayInputStream;
	import java.io.ByteArrayOutputStream;
	import java.io.File;
	import java.io.IOException;
	import java.util.Calendar;
	import java.util.Iterator;
	
	import javax.imageio.ImageIO;
	import javax.imageio.ImageReadParam;
	import javax.imageio.ImageReader;
	import javax.imageio.stream.ImageInputStream;
	import javax.imageio.stream.ImageOutputStream;
	
	public class CommonUtils {
		public static int getCurrentDateInt() {
			Calendar cal = Calendar.getInstance();
			int day = cal.get(Calendar.DATE);
			int month = cal.get(Calendar.MONTH) + 1;
			int year = cal.get(Calendar.YEAR);
	
			String dateAsInt = String.valueOf(year);
			if (month < 10)
				dateAsInt += "0";
			dateAsInt += String.valueOf(month);
			if (day < 10)
				dateAsInt += "0";
			dateAsInt += String.valueOf(day);
			return Integer.parseInt(dateAsInt);
		}
		
		public static boolean fileExists(String fileName){
			if(fileName==null)
				throw new IllegalArgumentException("fileName cannot be null");
			return new File(fileName).exists();
		}
	
		public static void saveByteImageToFile(byte[] bytes, String path)
				throws IOException {
			// Before is how to change ByteArray back to Image
			ByteArrayInputStream bis = new ByteArrayInputStream(bytes);
			Iterator<?> readers = ImageIO.getImageReadersByFormatName("gif");
			// ImageIO is a class containing static convenience methods for locating
			// ImageReaders
			// and ImageWriters, and performing simple encoding and decoding.
	
			ImageReader reader = (ImageReader) readers.next();
			Object source = bis; // File or InputStream, it seems file is OK
	
			ImageInputStream iis = ImageIO.createImageInputStream(source);
			// Returns an ImageInputStream that will take its input from the given
			// Object
	
			reader.setInput(iis, true);
			ImageReadParam param = reader.getDefaultReadParam();
	
			Image image = reader.read(0, param);
			// got an image file
	
			BufferedImage bufferedImage = new BufferedImage(image.getWidth(null),
					image.getHeight(null), BufferedImage.TYPE_INT_RGB);
			// bufferedImage is the RenderedImage to be written
			Graphics2D g2 = bufferedImage.createGraphics();
	
			//g2.drawImage(image, null, null);
			g2.drawImage(image, 0, 0, bufferedImage.getWidth(), bufferedImage.getHeight(), Color.white, null);
	
			File imageFile = new File(path);
	
			ImageIO.write(bufferedImage, "gif", imageFile);
			// "jpg" is the format of the image
			// imageFile is the file to be written to.
		}
	
		public static byte[] convertGifBytesToJpegBytes(byte[] bytes, Color backgroundColor) throws Exception
		{
		    ByteArrayInputStream inputStream = new ByteArrayInputStream(bytes);
		    BufferedImage bufferedImage = ImageIO.read(inputStream);
		    BufferedImage newBi = new BufferedImage(bufferedImage.getWidth(), bufferedImage.getHeight(), BufferedImage.TYPE_INT_RGB);
		    Graphics2D g2d = (Graphics2D) newBi.getGraphics();
		    g2d.drawImage(bufferedImage, 0, 0, bufferedImage.getWidth(), bufferedImage.getHeight(), backgroundColor, null);
		    //bufferedImage.getHeight(), null);
		    ByteArrayOutputStream osByteArray = new ByteArrayOutputStream();
		    ImageOutputStream outputStream = ImageIO.createImageOutputStream(osByteArray);
		    ImageIO.write(newBi, "jpg", outputStream);
		    outputStream.flush();
		    outputStream.close();
		    return osByteArray.toByteArray();
		}
	}
	
	'''

	def compileResult() '''
	package com.pallyup.sgl.server.core;
	
	import java.util.HashMap;
	
	public class Result {
		private HashMap<String, Object> resultData;
		
		public static enum Status {OK, FAILED};
		
		public Result(){
			resultData = new HashMap<String, Object>();
			this.resultData.put("status", Status.FAILED);
		}
		
		public void setData(Object data){
			this.resultData.put("data", data);
		}
		
		public void setStatus(Status status){
			if(status==null)
				throw new IllegalArgumentException("Result status cannot be null");
			
			if(status == Status.OK)
				this.resultData.put("status", Status.OK);
			else if (status == Status.FAILED)
				this.resultData.put("status", Status.FAILED);
		}
		
		public void setError(String errorMessage, int errorCode){
			HashMap<String, Object> error = new HashMap<String, Object>();
				error.put("message", errorMessage);
				error.put("code", errorCode);
			this.resultData.put("error", error);
		}
		
		public Object getData() {
			return resultData.get("data");
		}
		public Status getStatus(){
			return (Status) resultData.get("status");
		}
		public Object getError(){
			return this.resultData.get("error");
		}
		
		@Override
		public String toString() {
			return "Result [data=" + resultData + "]";
		}
	}

	'''
}