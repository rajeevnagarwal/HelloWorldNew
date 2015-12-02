jQuery(document).ready(function() {
    jQuery('.tabs .tab-links a').on('click', function(e)  {
        var currentAttrValue = jQuery(this).attr('href');
 
        // Show/Hide Tabs
        jQuery('.tabs ' + currentAttrValue).show().siblings().hide();
 
        // Change/remove current tab to active
        jQuery(this).parent('li').addClass('active').siblings().removeClass('active');
 
        e.preventDefault();
        

    });
    $('#hello').hide("<p>Hello</p>");
    $('#hello').append("");
    
    $('#checkSurfaceEnvironment-1').click(function()
    		{
    					
    					if ($("#checkSurfaceEnvironment-1").is(":checked")) {
    		        	    // do something if the checkbox is NOT checked
    		            //do something
    		        	//$('#hello').append("<p>Hello</p>");
    		        	$('#hello').show("<p>Hello</p>");
    		        	}
    		        	else if(!$("#checkSurfaceEnvironment-1").is(":checked"))
    		        		{
    		        		$('#hello').hide("<p>Hello</p>");
    		        		
    		        		}
    		}
    		        
    		        );
    $('#hello1').hide("<p>Hello</p>");
    $('#hello1').append("");
    
    $('#checkSurfaceEnvironment-2').click(function()
    		{
    					
    					if ($("#checkSurfaceEnvironment-2").is(":checked")) {
    		        	    // do something if the checkbox is NOT checked
    		            //do something
    		        	//$('#hello').append("<p>Hello</p>");
    		        	$('#hello1').show("<p>Hello</p>");
    		        	}
    		        	else if(!$("#checkSurfaceEnvironment-2").is(":checked"))
    		        		{
    		        		$('#hello1').hide("<p>Hello</p>");
    		        		
    		        		}
    		}
    		        
    		        );
    $('#hello2').hide("<p>Hello</p>");
    $('#hello2').append("");
    
    $('#checkSurfaceEnvironment-3').click(function()
    		{
    					
    					if ($("#checkSurfaceEnvironment-3").is(":checked")) {
    		        	    // do something if the checkbox is NOT checked
    		            //do something
    		        	//$('#hello').append("<p>Hello</p>");
    		        	$('#hello2').show("<p>Hello</p>");
    		        	}
    		        	else if(!$("#checkSurfaceEnvironment-3").is(":checked"))
    		        		{
    		        		$('#hello2').hide("<p>Hello</p>");
    		        		
    		        		}
    		}
    		        
    		        );
    $('#hello3').hide("<p>Hello</p>");
    $('#hello3').append("");
    
    $('#checkSurfaceEnvironment-4').click(function()
    		{
    					
    					if ($("#checkSurfaceEnvironment-4").is(":checked")) {
    		        	    // do something if the checkbox is NOT checked
    		            //do something
    		        	//$('#hello').append("<p>Hello</p>");
    		        	$('#hello3').show("<p>Hello</p>");
    		        	}
    		        	else if(!$("#checkSurfaceEnvironment-4").is(":checked"))
    		        		{
    		        		$('#hello3').hide("<p>Hello</p>");
    		        		
    		        		}
    		}
    		        
    		        );
});