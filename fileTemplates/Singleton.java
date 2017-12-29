#if (${PACKAGE_NAME} && ${PACKAGE_NAME} != "")package ${PACKAGE_NAME};#end
import org.apache.log4j.Logger;

#parse("File Header.java")
public class ${NAME}
{
    private static final Logger log = Logger.getLogger(${NAME}.class);
    
    private static ${NAME} ourInstance = new ${NAME}();

    public static ${NAME} getInstance() 
    {
        return ourInstance;
    }

    private ${NAME}() 
    {
    }
}
