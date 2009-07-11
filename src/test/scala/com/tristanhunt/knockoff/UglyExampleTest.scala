package com.tristanhunt.knockoff

import org.scalatest.testng._
import org.testng.Assert._
import org.testng.annotations._

/**
 * This actually was generated by a coworker. I call it an "ugly example" because, well, it's really
 * nasty looking.
 */
class UglyExampleTest extends TestNGSuite {
    
    import Imports._
        
    @Test
    def fullFile = {
        
        val content = io.Source.fromFile( "src/test/resources/UglyExample.txt" ).getLines.mkString( "" )
        
        knockoff( content ) match {
            case KnockOff.Parsed( blocks ) => println( "OK" )
            case KnockOff.Failed( msg ) => fail( msg )
        }
    }
}