package com.capacitacion2.capacitacion2.clase8;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(tags = "@Proyecto",monochrome = true,
plugin = "pretty",features = "src/test/resources/Features",
glue = "com.capacitacion2.capacitacion2.stepsproyecto")
public class RunnerProyecto {

}
