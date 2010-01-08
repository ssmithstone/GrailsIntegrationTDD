package ssmithstone

import grails.test.GrailsUnitTestCase

class MyControllerIntegrationTests extends GrailsUnitTestCase {
  MyController controller

  protected void setUp() {
    super.setUp()
    controller = new MyController()
  }

  protected void tearDown() {
    super.tearDown()
  }
  void testJSONResponseForList() {

    controller.request.contentType = "text/json"

    controller.list()

    String actualJSON = controller.response.contentAsString

    assertEquals "{\"success\":true}" , actualJSON
  }

  void testJSONResponseForInfo(){

    controller.request.contentType = "text/json"

    controller.info()

    String actualJSON = controller.response.contentAsString

    assertEquals "{\"success\":true}" , actualJSON

  }

}
