        //script
        
        $(document).ready(function(){
            var result=0;
            $("#div2").hide();
            $("#div3").hide();
            $("#div4").hide();
            $("#div5").hide();
            $("#again").hide();
            $(".next").click(function(){
                if($("#div1").is(":visible"))
                {
					if($("input[name='question1']:checked").val()!=null)
                    {
						if($("input[name='question1']:checked").val()==14){
                            result++;}
						$("#div1").hide();
						$("#div2").show();
					}
                    else{
						alert("Please select any one Option...");}
                }
                else if($("#div2").is(":visible"))
                {
                    if($("input[name='question2']:checked").val()!=null)
                    {
						if($("input[name='question2']:checked").val()==20){
                            result++;}
						$("#div2").hide();
						$("#div3").show();
					}
                    else{
						alert("Please select any one Option...")}
                }
                else if($("#div3").is(":visible"))
                {
                    if($("input[name='question3']:checked").val()!=null)
                    {
						if($("input[name='question3']:checked").val()==1){
                            result++;}
						$("#div3").hide();
                        $("#div4").show();
					}
                    else{
						alert("Please select any one Option...")}
                }

                else if($("#div4").is(":visible"))
                {
                    if($("input[name='question4']:checked").val()!=null)
                    {
						if($("input[name='question4']:checked").val()==1){
                            result++;}
						$("#div4").hide();
						$("#div5").show();
					}
                    else{
						alert("Please select any one Option...")}
                }
               
                else if($("#div5").is(":visible"))
                {
                    if($("input[name='question5']:checked").val()!=null)
                    {
						if($("input[name='question5']:checked").val()==1){
                            result++;}
						$("#div5").hide();
                        $("#result").html("<p>Congratulations....</p><br>You Score :"+result +" marks");
                        $("#again").show();
					}
                    else{
						alert("Please select any one Option...")}
                }
        });
});

function startagain(){
    location.replace("jquery_home_page.html");
}