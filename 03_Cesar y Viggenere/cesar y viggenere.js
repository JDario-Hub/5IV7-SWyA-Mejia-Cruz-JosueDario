
const abc = ['a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm',
            'ñ', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'];

            var cesar = cesar || (function() {
                var proceso = function (txt, desp, action) {
                    var replace = (function() {
                        //en el cuerpo principal de la funcion del callback
                        //debemos de empezar a definir los elementos necesarios para
                        //el cifrado:
                        //abc
                        
                        var l = abc.length;
                        //debemos de retornar posicion del caracter
                        return function(c) {
                            //variable para iterar en mi arreglo del abc
                            var i = abc.indexOf(c.toLowerCase());
                            //asegurarse que este dentro de mi rango
                            if (i != -1) {
                                var pos = i;
                                if (action) {
                                    //cifrar (avanza)
                                    pos += desp;
                                    //nuestro limite es el tamaño del abc; por lo tanto
                                    //tenemos que darle vueltas y vueltas y vueltas sobre
                                    //el mismo tamaño
                                    pos -= (pos >= l)?l:0;
                                } else {
                                    //descifrar (retrocede)
                                    pos -= desp;
                                    pos += (pos < 0)?l:0;
                                }
                                return abc[pos];
                            }
                             //retornar el caracter o la poscion del caracter
                            return c;
                        };
                    })();
                    //necesito una expresion regular para mi abc
                    var re = (/([a-z])/ig);
                    //alert(re);
                    //esta es la funcion que se encarga del reemplazo
                    //acorde a la poscion que esta obteniendo respecto del caracter
                    //para recorrer el abc
                    return String(txt).replace(re, function (match) {
                        return replace(match);
                    });
                };
            
                //hay que definir la accion a realizar en el algoritmo
                return {
                        encode: function(txt, desp) {
                        return proceso(txt, desp, true);
                    },
                        decode: function(txt, desp) {
                        return proceso(txt, desp, false);
                    }
                };
            })();

            let key = '';


            var viggenere= 'document';


            $(document).ready(function(){
            
                //debe de entrar el texto plano y la llave
                $('#ci').click(function(){
                    //tenemos que aplicar el mod 27 de mi algoritmo
                    // y = (x+z)mod27
            
                    key = document.getElementById('llave').value;
            
                    key = key.replace(/ /g,'');
            
                    //mensaje
            
                    let mess = document.getElementById('mess').value;
            
                    mess = mess.replace(/ /g, '');
            
                    //variables para la operacion del algoritmo
            
                    let newMess = '';
                    let keyComplete = '';
            
                    if(revision(mess, key)){
            
                        /* Dentro del algoritmo recordemos que debemos de 
                        recorrer todo el mensaje del texto plano, y se va a colocar
                        o a superponer los caracteres de la llave 
                        para despues realizar la parte de sistema de coordenadas */
            
                        for(var i = 0; i < mess.length; i++){
                            keyComplete += key.charAt((i%Number(key.length)));
                        }
                        alert(keyComplete);
                        //me sirve para obtener la posicon de la letra por letra dentro del mensaje
                        for(var i = 0; i < mess.length; i++){
            
                            //definir variables para ese mensaje de caracter por caracter
                            let charr = mess.charAt(i);
                            let posm = getPosition(charr);
            
                            charr = keyComplete.charAt(i);
            
                            let posk = getPosition(charr);
            
                            //vamos a ejecutar el algoritmo
            
                            let newVal = change(posm, posk);
            
                            newMess += abc[newVal];
                        }
                        document.getElementById('rs').value = newMess;
                    }else{
            
                        //esto si no se cumple la revision
            
                        //wiii chillar pq no se hace
            
                    }
                });
            
                $('#de').click(function(){
                    //para el descifrado entra el mensaje cifrado y la llave
                    key = document.getElementById('llave').value;
            
                    key.replace(/ /g, '');
            
                    mess = document.getElementById('mess').value;
            
                    mess.replace(/ /g, '');
            
                    let newMess = "";
            
                    let keyComplete = '';
            
                    if(revision(mess, key)){
            
                        for(var i = 0; i < mess.length; i++){
            
                            keyComplete += key.charAt((i%Number(key.length)));
                        }
                        alert(keyComplete);
            
                        for(var i = 0; i < mess.length, i++;) {
            
                            //obtener la posicon de la letra del mensaje
                            let charr = mess.charAt(i);
            
                            let posm = getPosition(charr);
            
                            charr = keyComplete.charAt(i);
            
                            let posk = getPosition(charr);
            
                            //ejecutamos algoritmo
            
                            let newVal = reChange(posm, posk);
            
                            newMess += abc[newVal];
                        }
                        document.getElementById('rs').value = newMess;
                    }else{
            
                        //si no cumple al revision
                    }
                });
            });
            
            //las funciones para las operaciones
            //change aplicar el mod 27 para poder recorrer el arreglo del abc
            
            function change(posm, posk){
            
                let y = (posm + posk)%27;
                return y;
            }
            
            //la funcion del recambio XD
            function reChange(posm, posk){
            
                let val = 0;
                if((posm-posk)>=0){
                    val = (posm + posk)%27;
                }else{
                    val = (posm - posk + 27)%27;
                }
                return val;
            }
            
            //la posicion de cada letra para devolverla 
            
            function getPosition(letra){
                let position = abd.indexOf(letra);
                return position;
            }
            
            //revision que en si es el algoritmo
            
            function revision(mess, desp){
            
                const re = /^([a-zñ]+([]*[a-zñ]?['-]?[a-zñ?]+)*)$/;
            
                var acc = true;
            
                if(!re.test(mess)){
                    sd();
                    acc = false;
                }
                if(!re.test(desp)){
                    sdd();
                    acc = false;
                }
                if(desp.length > mess.length){
                    sz();
                }
                return acc;
            }
            
            //sd que es cuando no se ha ingresado solo minusculas y evitar los numeros o simbolos
            
            function sd(){
            
                /*
                Swal.fire({
                    title:"Error", 
                    text: "El texto ingresado no ha sido aceptado, ingrese todo en minusculas y evite los numeros y simbolos",
                    icon: 'error'
                });
                */
               alert("El texto ingresado no ha sido aceptado, ingrese todo en minusculas y evite los numeros y simbolos");
            }
            
            
            function sdd(){
            
                /*
                Swal.fire({
                    title:"Error", 
                    text: "La clave ingresada es incorrecta, no cumple con la norma de revision evite numeros y simbolos",
                    icon: 'error'
                });
                */
               alert("La clave ingresada es incorrecta, no cumple con la norma de revision evite numeros y simbolos");
            }
            
            function sz(){
            
                /*
                Swal.fire({
                    title:"Error", 
                    text: "La llave no puede ser mayor que el mensaje",
                    icon: 'error'
                });
                */
               alert("La llave no puede ser mayor que el mensaje");
            }
            

            function cifrar(){
                document.getElementById("resultado").innerHTML = 
                cesar.encode(document.getElementById("cadena").value, 4);
            }
            
            //decodificar o descifrar
            function descifrar(){
                document.getElementById("resultado").innerHTML = 
                cesar.decode(document.getElementById("cadena").value, 4);
            }
            