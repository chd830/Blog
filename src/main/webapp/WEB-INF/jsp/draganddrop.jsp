<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <title>DRAG AND DROP</title>
    <style>
        div {
            width: 250px;
            height: 250px;
            padding: 10px;
            border: 1px solid #aaaaaa;
            float: left;
        }
    </style>
    <script>
        function allowDrop(ev) {
            ev.preventDefault();
        }

        function drag(ev) {
            ev.dataTransfer.setData("text", ev.target.id);
        }

        function drop(ev) {
            ev.preventDefault();
            var data = ev.dataTransfer.getData("text");
            ev.target.appendChild(document.getElementById(data));
        }
    </script>
</head>
<body>

<div>
    <table>
        <tr>
            <td><div ondrop="drop(event)" ondragover="allowDrop(event)"><p id="drag1"  draggable="true" ondragstart="drag(event)">TEST</p></div></td>
            <td><div ondrop="drop(event)" ondragover="allowDrop(event)"></div></td>
        </tr>
        <tr>
            <td><div ondrop="drop(event)" ondragover="allowDrop(event)"></div></td>
            <td><div ondrop="drop(event)" ondragover="allowDrop(event)"></div></td>
        </tr>
    </table>
</div>
</body>
</html>

