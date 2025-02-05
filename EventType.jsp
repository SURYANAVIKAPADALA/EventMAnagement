<!DOCTYPE html>
<html lang="en">

<head>
    <title>Event Type</title>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
</head>

<link rel="stylesheet" href="main.css">


<body>

    <nav class="navbar navbar-inverse">
        <div class="container-fluid">
            <div class="navbar-header">
                <a class="navbar-brand">Book Your Event</a>
            </div>
            <ul class="nav navbar-nav">
                <li><a href="#">Home</a></li>
                <li class="dropdown"><a class="dropdown-toggle" data-toggle="dropdown" href="#">Booking <span
                            class="caret"></span></a>
                    <ul class="dropdown-menu">
                        <li><a href="s3">Book an Event</a></li>
                            <li><a href="s4">Event Requirements</a></li>
                            
                    </ul>
                </li>
                <li><a href="s6">Contact us</a></li>
                <li><a href="s7">Feedback</a></li>
            </ul>
            <ul class="nav navbar-nav navbar-right">
                <li><a href="s2"><span class="glyphicon glyphicon-user"></span> Sign Up</a></li>
                <li><a href="s1"><span class="glyphicon glyphicon-log-in"></span> Login</a></li>
            </ul>
        </div>
    </nav>

    <h1>
        <center><b> Select your eEvent Type</b></center>
    </h1>
    <div class="container">
        <form action="bk">
            <table border=3>
                <tr>
                    <th>Event Name</th>
                    
                </tr>
                <tr>
                    <td>Haldi</td>
                    
                </tr>
                <tr>
                    <td>Marrige</td>
                    
                </tr>
                <tr>
                    <td>Birthday</td>
                    
                </tr>
                <tr>
                    <td>Reception</td>
                    
                </tr>
                
            </table><br>



            <tr>
                <td>Available Events
                <td><select name=t10>
                        <option>select...</option>
                        <option value="Haldi">...Haldi...</option>
                        <option value="Marrige">...Marrige...</option>
                        <option value="Birthday">...Birthday...</option>
                        <option value="Reception">...Reception...</option>
                        <option value="Others">...Your Event...</option>

                    </select>
                    <label for="name"> Others</label>
                <input type="text" id="fname" name="t7" placeholder="Enter Event You want to celebrate"><br><br>
            </tr><br><br>


            <tr>
                <button type="submit" class="signupbtn">Submit</button>
            </tr>
            </td><br>
        </form>
    </div>
</body>

</html>