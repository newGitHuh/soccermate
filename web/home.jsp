<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="UTF-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <title>Homepage</title>

    <link
      href="https://unpkg.com/boxicons@2.1.4/css/boxicons.min.css"
      rel="stylesheet"
    />
    <link
      rel="stylesheet"
      href="https://fonts.googleapis.com/css2?family=Material+Symbols+Outlined:opsz,wght,FILL,GRAD@20..48,100..700,0..1,-50..200"
    />
    <link rel="stylesheet" href="css/homepage/homepage.css" type="text/css">
    <link rel="stylesheet" href="css/global/base.css" type="text/css">

  </head>

  <body>
    <div class="homepage-container">
      <header class="navbar-container">
        <nav class="navbar">
          <h2>SPORTZ</h2>
          <form class="search-form" action="">
            <input type="text" placeholder="Search..." />
            <button type="submit">
              <i class="bx bx-search-alt"></i>
            </button>
          </form>
          <div class="navigation">
            <a href="">Stores</a>
            <a href="">Collection</a>
            <a href="">Company</a>
            <a href="">Contact us</a>
          </div>
          <a class="login" href="login.jsp">Sign in</a>
        </nav>
      </header>
      <div class="inner-homepage">
        <h2 class="header-title">NEW COLLECTION IS HERE</h2>
        <section class="section1"></section>
      </div>
    </div>
      <p>HI ${sessionScope.user.username}</p>
  </body>
</html>
