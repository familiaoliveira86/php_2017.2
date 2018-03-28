<!DOCTYPE html>
<!--
To change this license header, choose License Headers in Project Properties.
To change this template file, choose Tools | Templates
and open the template in the editor.
-->
<html>
    <head>
        <meta charset="UTF-8">
        <title>verificação de retorno de par ou impar</title>
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
    </head>
    <body>
        <!-- Crie um programa para que dado um número qualquer, seja verificado se
ele é par ou ímpar.
-->

<div class="conainer">
    <div class="rows">
        <form method="post" name="reificar par ou impar" action="#"
              <legend>par ou impar?</legend>
            <fildeset>
                <label for="id_inteiro">Digite um numero inteiro</label>
                <input type="number" id="inteiro" name="id_inteiro">
            </fildeset>
            <input type="submit" value="Enviar">
        </form>
    </div>
    <div class="rows"></div>
 <?php
 if(isset($_POST['id_inteiro'])){
     $inteiro = $_POST['id_inteiro'];
     if($inteiro%2 == 0){
         echo (" O numero didigitado e par ");
     }else {
     echo (" O numero dijitado e impar ");
     }
     }
      
                // put your code here
        ?>
    </body>
</html>
