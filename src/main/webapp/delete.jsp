<!DOCTYPE html>
<html>
<head>
    <title>Delete User</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            margin: 20px;
        }

        label {
            display: block;
            margin-bottom: 10px;
        }

        input[type="text"] {
            padding: 5px;
            width: 200px;
        }

        button {
            padding: 10px 20px;
            background-color: #ff0000;
            color: #fff;
            border: none;
            cursor: pointer;
        }

        button:hover {
            background-color: #cc0000;
        }
    </style>
</head>
<body>
<h1>Delete User</h1>
<form action="delete" method="post">
    <label for="id">User ID:</label>
    <input type="text" id="id" name="id" required>
    <br>
    <button type="submit" onclick="deleteUser()">Delete</button>
</form>

<script>
    function deleteUser() {
        // Get the user_id value
        var user_id = document.getElementById("user_id").value;

        // Make an AJAX request to delete the user with the given user_id
        // Replace the URL below with the appropriate endpoint for your backend
        var url = "http://example.com/delete-user?user_id=" + user_id;

        var xhr = new XMLHttpRequest();
        xhr.open("DELETE", url, true);
        xhr.onreadystatechange = function() {
            if (xhr.readyState === 4 && xhr.status === 200) {
                // User deleted successfully, perform any necessary actions here
                alert("User deleted successfully!");
            } else if (xhr.readyState === 4 && xhr.status !== 200) {
                // Error occurred while deleting user, handle the error here
                alert("An error occurred while deleting the user.");
            }
        };
        xhr.send();
    }
</script>
</body>
</html>
