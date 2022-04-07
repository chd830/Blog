<html>
<head>
    <titile>MAIN</titile>
    <script src="http://code.jquery.com/jquery-3.5.1.min.js"></script>
     <script type="text/javascript">
        function button_click() {
            var lines = $('#before').val().split("\n");
            var parent = document.getElementById("after");
            for(var i = 0; i < lines.length; i++) {
                if(lines[i].indexOf("### ") == 0) {
                    var tag = document.createElement('p');
                    tag.setAttribute('class', 'ptag');
                    tag.setAttribute('style', 'font-size: 1em');
                    tag.innerHTML += "<p>"+lines[i]+"</p>\n";
                    parent.appendChild(tag);
                }
                else if(lines[i].indexOf("## ") == 0) {
                    var tag = document.createElement('p');
                    tag.setAttribute('class', 'ptag');
                    tag.setAttribute('style', 'font-size: 2em');
                    tag.innerHTML += "<p>"+lines[i]+"</p>\n";
                    parent.appendChild(tag);
                }
                else if(lines[i].indexOf("# ") == 0) {
                    var tag = document.createElement('p');
                    tag.setAttribute('class', 'ptag');
                    tag.setAttribute('style', 'font-size: 4em');
                    tag.innerHTML += "<p>"+lines[i]+"</p>\n";
                    parent.appendChild(tag);
                }
                else if(lines[i].indexOf("- ") == 0) {
                    var tag = document.createElement('p');
                    tag.setAttribute('class', 'ptag');
                    tag.innerHTML += "<p>"+lines[i]+"</p>\n";
                    parent.appendChild(tag);
                }
            }

        }
    </script>
</head>
<body>
<<div class="container">
    <div>
        <form class="form-inline" role="form">
            <div class="form-group">
                <textarea class="form-control" id="before" rows="3"></textarea>
                <button type="button" onclick="button_click()" class="btn btn-secondary">CHANGE</button>
            </div>
        </form>
        <form class="form-inline" role="form" id="after">

        </form>
    </div>
</div>
</body>
</html>
