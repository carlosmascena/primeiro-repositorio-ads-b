        // Tela de Cadastro
        function valida_login(){
            var login1 = login.value;
            if(login1.includes('@') == true && login1.includes('.com') == true){
                login.style = 'border-color:green';
                msg.innerHTML = '<br> Email válido ;)';
                
            }else{
                login.style = 'border-color:red'
                msg.innerHTML = '<br> Digite um email válido!';
            }
        }
    
        function valida_senha(){
            var senha1 = senha.value;
            if(senha1.length >= 8){
                senha.style = 'border-color:green';
                msg.innerHTML = '<br> Senha válida ;)';
                
            }else{
                senha.style = 'border-color:red'
                msg.innerHTML = '<br> Digite uma Senha válida!';
            }
        }
    
        function valida_senha1(){
            var confirme1 = confirme.value;
            if(confirme1.length >= 8){
                confirme.style = 'border-color:green';
                msg.innerHTML = '<br> Senha válida ;)';
                
            }else{
                confirme.style = 'border-color:red'
                msg.innerHTML = '<br> Digite uma Senha válida!';
            }
        }    

        // Tela de Login
        
        function valida_login(){
            var login1 = login.value;
            if(login1.includes('@') == true && login1.includes('.com') == true){
                login.style = 'border-color:green';
                msg.innerHTML = '<br> Email válido ;)';
                
            }else{
                login.style = 'border-color:red'
                msg.innerHTML = '<br> Digite um email válido!';
            }
        }
    
        function valida_senha(){
            var senha1 = senha.value;
            if(senha1.length >= 8){
                senha.style = 'border-color:green';
                msg.innerHTML = '<br> Senha válida ;)';
                
            }else{
                senha.style = 'border-color:red'
                msg.innerHTML = '<br> Digite uma Senha válida!';
            }
        }
