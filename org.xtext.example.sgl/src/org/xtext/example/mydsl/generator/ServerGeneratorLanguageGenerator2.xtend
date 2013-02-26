package org.xtext.example.mydsl.generator

import org.eclipse.xtext.generator.IGenerator
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.IFileSystemAccess

class ServerGeneratorLanguageGenerator2 implements IGenerator {
	
	override doGenerate(Resource input, IFileSystemAccess fsa) {
		fsa.generateFile("src"+"/"+"com"+"/"+"pallyup"+"/"+"sgl"+"/"+"core"+"/"+"data"+"/"+ //package "com.pallyup.sgl.core.data"
		    	"SGLSqlProvider.java", //class name
		    	compileSGLSqlProvider)
	}
	
	def compileSGLSqlProvider() '''
	Output
	'''
}
		
	