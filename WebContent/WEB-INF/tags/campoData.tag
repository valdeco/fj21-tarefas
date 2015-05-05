<%@ attribute name="id" required="true" %>


<input id="${id}" name="${id}" />
<script>
  $("#${id}").datepicker({dateFormat: 'dd/mm/yy', yearRange:"1900:2050"});
  
//Getter
  var changeMonth = $( "#${id}" ).datepicker( "option", "changeMonth" );
  var changeYear = $( "#${id}" ).datepicker( "option", "yearRange" ); 

// Setter
  $( "#${id}" ).datepicker( "option", "changeMonth", true );
  $( "#${id}" ).datepicker( "option", "changeYear", "1900:2050" );
</script>