package com.capacitacion2.capacitacion2.clase8;

import  org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(monochrome = true,plugin = "pretty",features = "src/test/resources/Features2", glue = "com.capacitacion2.capacitacion2.clase8.Tarea.stepdefinitions")
public class Runner2 {

}
 