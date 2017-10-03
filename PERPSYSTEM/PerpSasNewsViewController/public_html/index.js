function showDemoVideoForRole() {
  // Chuyen den Tab Gioithieu/vaitro
  var tabIntro=  AdfPage.PAGE.findComponent("introduction");// AdfRichShowDetailItem   
  tabIntro.setDisclosed(true);
}




function mouseOverImageRole(e) { 
    var img = e.getSource();    
    var icon= img.getIcon();// images/role1_out.png
    var i= icon.lastIndexOf(".");
    var j= icon.lastIndexOf("_");
    var ext= icon.substring(i+1);
    var icon2= icon.substring(0,j)+"_over."+ext;
    
    if(icon2.indexOf("http")>-1) {
       img.setIcon(icon2); 
    }else {
      var s=window.location.toString();     
      var k= s.lastIndexOf("/sasn/");       
      img.setIcon(s.substring(0,k)+icon2); 
    }  
}


 function mouseOutImageRole(e) {     
    var img = e.getSource();    
    var icon= img.getIcon();// images/role1_over.png
    var i= icon.lastIndexOf(".");
    var j= icon.lastIndexOf("_");
    var ext= icon.substring(i+1);
    var icon2= icon.substring(0,j)+"_out."+ext;
    if(icon2.indexOf("http")>-1) {
       img.setIcon(icon2); 
    }else {
      var s=window.location.toString();     
      var k= s.lastIndexOf("/sasn/");       
      img.setIcon(s.substring(0,k)+icon2); 
    }
}

