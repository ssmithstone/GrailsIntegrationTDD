package ssmithstone

class MyController {

  def index = { }

  def list = {
    withFormat{
      json{
        render(contentType:"text/json"){
          success(true)
        }
      }
    }
  }

  def info = {
    withFormat{
      json{
        render(contentType:"text/json"){
          success(true)
        }
      }
    }
  
  }
}
