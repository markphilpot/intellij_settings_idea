#if (${PACKAGE_NAME} && ${PACKAGE_NAME} != "")package ${PACKAGE_NAME};#end
import org.apache.log4j.Logger;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.MatcherAssert.assertThat;

#parse("File Header.java")
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ${NAME} 
{
    private static final Logger log = Logger.getLogger(${NAME}.class);

}