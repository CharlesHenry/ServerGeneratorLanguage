package org.xtext.example.mydsl.generator;

import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.generator.IFileSystemAccess;
import org.eclipse.xtext.generator.IGenerator;

@SuppressWarnings("all")
public class ServerGeneratorLanguageGenerator2 implements IGenerator {
  public void doGenerate(final Resource input, final IFileSystemAccess fsa) {
    String _plus = ("src" + "/");
    String _plus_1 = (_plus + "com");
    String _plus_2 = (_plus_1 + "/");
    String _plus_3 = (_plus_2 + "pallyup");
    String _plus_4 = (_plus_3 + "/");
    String _plus_5 = (_plus_4 + "sgl");
    String _plus_6 = (_plus_5 + "/");
    String _plus_7 = (_plus_6 + "core");
    String _plus_8 = (_plus_7 + "/");
    String _plus_9 = (_plus_8 + "data");
    String _plus_10 = (_plus_9 + "/");
    String _plus_11 = (_plus_10 + 
      "SGLSqlProvider.java");
    CharSequence _compileSGLSqlProvider = this.compileSGLSqlProvider();
    fsa.generateFile(_plus_11, _compileSGLSqlProvider);
  }
  
  public CharSequence compileSGLSqlProvider() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("Output");
    _builder.newLine();
    return _builder;
  }
}
