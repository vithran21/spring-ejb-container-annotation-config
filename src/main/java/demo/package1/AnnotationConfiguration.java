package demo.package1;

import org.springframework.context.annotation.ComponentScan;

//@ComponentScan -- default same package is scanned
@ComponentScan("demo") // considers all folders under demo (base package name)
//@ComponentScan("demo.package1")
public class AnnotationConfiguration {

}
