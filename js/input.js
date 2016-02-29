
$( document ).ready(function() {






var data = [];


$('#page1').find('div').click(function() {
  var gender = $(this).attr("id");
  data.push(gender);
  if (data[0] == "male") {
    data[0] =1;

  }else {
    data[0] = 0;


  }

  $('#isMale').attr('value', data[0]);

  $('#page1').css("display","none");
  $('#page2').css("display","block");


//alert(data);

});



$('#page2').find('div').click(function() {
  var choice = $(this).attr("id");
  data.push(choice);

  if (data[1] == "GM") {
    data[1] = 1;

  }else {
    data[1] = 0;

  }

  $('#isGain').attr('value', data[1]);
  $('#page2').css("display","none");
  $('#page3').css("display","block");


//alert(data);

});








data = [];








});
