package Runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
@RunWith(Cucumber.class)
@CucumberOptions(features="placeValidations",
glue={"StepDefinations"})
public class Test_runner {
}
//making changes in master
// Hi all I have made some changes to check pull functionality from eclips
