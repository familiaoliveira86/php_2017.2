<!DOCTYPE html>
<!--
Autor :Claudemir Oliveira.
Local : Senac Niteroi.
Data : 08-03-2018.
Finalidade: pagina principal de projeto.
-->
<html>
    <head>
        <meta charset="UTF-8">
        <title>Aula 03 </title>
    </head>
    <body>
        <?php
        # Quando queremos definir uma variavel devemos utilizar o simbolo $
        $variavel = "Variável Exemplo";
        
        # Porém, quando queremos definir uma váriavel de váriavel utilizamos a simbologia $$
        $$variavel = 8;
                
        echo "O valor da $variavel é ". $$variavel;
        echo "<br>O valor da $variavel é {$$variavel}";
        echo "<br>";
        var_dump(boolval(0));
        echo "<br>";
        var_dump(boolval(1));
        ?>
    </body>
</html>
