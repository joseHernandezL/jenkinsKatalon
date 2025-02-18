<?xml version="1.0" encoding="UTF-8"?>
<WebElementEntity>
   <description></description>
   <name>matriculaVer_selectComunaApo2</name>
   <tag></tag>
   <elementGuidId>a63a3591-1e30-4a29-8f7e-382c2b5b5508</elementGuidId>
   <selectorCollection>
      <entry>
         <key>XPATH</key>
         <value>//select[@id='e_apo_com']</value>
      </entry>
      <entry>
         <key>CSS</key>
         <value>#e_apo_com</value>
      </entry>
   </selectorCollection>
   <selectorMethod>XPATH</selectorMethod>
   <smartLocatorCollection>
      <entry>
         <key>SMART_LOCATOR</key>
         <value>#e_apo_com</value>
      </entry>
   </smartLocatorCollection>
   <smartLocatorEnabled>false</smartLocatorEnabled>
   <useRalativeImagePath>true</useRalativeImagePath>
   <webElementProperties>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>tag</name>
      <type>Main</type>
      <value>select</value>
      <webElementGuid>21dc6b67-3368-4f5e-a536-5fa930d12c79</webElementGuid>
   </webElementProperties>
   <webElementProperties>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>class</name>
      <type>Main</type>
      <value>form-control apoderado_comuna4473539</value>
      <webElementGuid>491812ff-001b-4199-9936-72298f5e3978</webElementGuid>
   </webElementProperties>
   <webElementProperties>
      <isSelected>true</isSelected>
      <matchCondition>equals</matchCondition>
      <name>id</name>
      <type>Main</type>
      <value>e_apo_com</value>
      <webElementGuid>afc50b2d-bb51-49f1-9bdb-2e8814fdc1fa</webElementGuid>
   </webElementProperties>
   <webElementProperties>
      <isSelected>true</isSelected>
      <matchCondition>equals</matchCondition>
      <name>name</name>
      <type>Main</type>
      <value>e_apo_com</value>
      <webElementGuid>dc4559e6-1a33-4f5e-99a1-dbf31e347b39</webElementGuid>
   </webElementProperties>
   <webElementProperties>
      <isSelected>true</isSelected>
      <matchCondition>equals</matchCondition>
      <name>text</name>
      <type>Main</type>
      <value>    



	
		
		
		
		
		
		
		
		WebClass Software | Ingreso Plataforma
		

		
		

		
		
		
		
		
		
		
		
		
		
			
			$(document).ready(inicializarPagina);
			function inicializarPagina()
			{	
				$(&quot;#respuesta_login&quot;).hide();
				$(&quot;#respuesta_login2&quot;).hide();
				$(&quot;section#reiniciar-pass-form-container&quot;).hide();
				$(&quot;section#solicitar-pass-form-container&quot;).hide();
				$(&quot;.mostrar-selclass&quot;).hide();
				$(&quot;#regresar-selclass&quot;).hide();
				if (window.location.hash == '#recuperar') {
					$(&quot;#inputUsuario&quot;).val('');
					$(&quot;#inputUsuario2&quot;).val('');
					$(&quot;#inputPass&quot;).val('');
					$(&quot;section#signup-form-container&quot;).hide();
					$(&quot;#respuesta_login&quot;).hide();
					$(&quot;#respuesta_login2&quot;).hide();
					$(&quot;section#reiniciar-pass-form-container&quot;).show();
					$(&quot;reiniciar-pass-form&quot;).show();
				}
				if (window.location.hash == '#selclass') {
					$(&quot;#inputUsuario&quot;).val('');
					$(&quot;#inputUsuario2&quot;).val('');
					$(&quot;#inputPass&quot;).val('');
					$(&quot;section#signup-form-container&quot;).hide();
					$(&quot;#respuesta_login&quot;).hide();
					$(&quot;#respuesta_login2&quot;).hide();
					$(&quot;section#reiniciar-pass-form-container&quot;).show();
					$(&quot;reiniciar-pass-form&quot;).show();
					$(&quot;.login-sec&quot;).addClass(&quot;login-sec-selclass&quot;);
					$(&quot;.login-sec-selclass&quot;).removeClass(&quot;login-sec&quot;);
					$(&quot;.mostrar-webclass&quot;).hide();
					$(&quot;.mostrar-selclass&quot;).show();
					$(&quot;#regresar-selclass&quot;).show();
					$(&quot;#regresar&quot;).hide();	
					$(&quot;.footer-section&quot;).hide();	
				}
				$(&quot;#inputUsuario&quot;).keyup(function(e)
				{
					if( e.which == 13 )
						$(&quot;#button&quot;).click( switchUsuario(1) );
				});

				$(&quot;#inputPass&quot;).keyup(function(e)
				{
					if( e.which == 13 )
						$(&quot;#button2&quot;).click( switchUsuario(1) );
				});

				$(&quot;#button&quot;).keyup(function(e)
				{
					if( e.which == 13 )
						$(&quot;#button&quot;).click( switchUsuario(1) );
				});

				$(&quot;#inputUsuario2&quot;).keyup(function(e)
				{
					if( e.which == 13 )
					{
						$(&quot;#button2&quot;).click( switchUsuario(2) );
					}
				});

				$(&quot;#button2&quot;).keyup(function(e)
				{
					if( e.which == 13 )
					{
						$(&quot;#button2&quot;).click( switchUsuario(2) );
					}
				});
				$(&quot;#recuperar&quot;).click(recuperarClave);	
				$(&quot;#solicitar&quot;).click(solicitarClave);		
			}
			function recuperarClave()
			{
				$(&quot;#inputUsuario&quot;).val('');
				$(&quot;#inputUsuario2&quot;).val('');
				$(&quot;#inputPass&quot;).val('');
				$(&quot;section#signup-form-container&quot;).hide();
				$(&quot;#respuesta_login&quot;).hide();
				$(&quot;#respuesta_login2&quot;).hide();
				$(&quot;section#reiniciar-pass-form-container&quot;).show();
				$(&quot;form#reiniciar-pass-form&quot;).show();
			}	
			function solicitarClave()
			{
				$(&quot;#inputUsuario&quot;).val('');
				$(&quot;#inputUsuario2&quot;).val('');
				$(&quot;#inputPass&quot;).val('');
				$(&quot;section#signup-form-container&quot;).hide();
				$(&quot;#respuesta_login&quot;).hide();
				$(&quot;#respuesta_login2&quot;).hide();
				$(&quot;section#solicitar-pass-form-container&quot;).show();
				$(&quot;form#solicitar-pass-form&quot;).show();
			}	
		
	
	
		
		
				

		
			
				
					
						
							
								Bienvenidos
							
							
							
								
									Usuario
									
								
								
									Contraseña
									
								
								
								
									Ingresar
									
										
											Olvidé mi contraseña
										
										
											No tengo usuario
										
									
								
								
								
							
							
                                
                                
							
						
						
							
								
									Cambiar contraseña
								
								
									
										
										
									
									
										
										Escribe tu usuario para restablecer la contraseña
										
										
											Usuario
											
										
										
											Enviar
											
											
												Regresar
												Regresar
											
										
										
										
									
								
							
						
						
							
								
									
										
									
									
										
											Estimado usuario.
										
										
											
												
													Para crear su contraseña de acceso, debe comunicarse con el WebClass Manager de su Colegio.
											
										
										
											Gracias.
										
										
									
									
											
												Regresar
											
										
								
							
						
					
					
						
					
				
			
		

		
			

				
				
					
						
							
								
									Síguenos en nuestras redes
									
										
										
											
												
											
										
										
											
												
											
										
									
								
							
							
								
									Conoce otros servicios
									
										SELChile
										NEWS
										PAE
										WebClass Suite
										VirtualClass
									
								
							
							
								
									Portales de Educación
									
										MINEDUC
										Agencia de la Calidad
										Superintendencia
										Consejo Nacional
										Educar Chile
									
								
							
							
								
									Oficina Central
									Av. del Valle Norte 961, Of. 5704 Ciudad Empresarial - Huechuraba Santiago, Chile
									Fono Soporte: +56 2 2869 9100
									Fono Empresa: +56 2 2656 7574
									Fono Ventas: +56 2 2656 7634
									Email: ventas@webclass.com
								
							
						
					
					
						
							
								
									
										© 2025 WebClass.com | Todos los derechos reservados.
									
									
										
										
									
								
							
						
					
				
				
			
		
		
		
		

	
		@media (width:500px) {
			section#home {
				background: none !important;
				background-color: #fff !important;
				height: 350px;
			}
			.logo-slider img {
				width: 50% !important;
				margin-bottom: 10px !important;
			}
			.footer-section {
				display: none;
			}
			.login-form p#instrucciones-form {
				font-size: 14px;
			}
			section#reiniciar-pass-form-container {
				padding: 0px !important;
			}
			section#home {
				padding-top: 25px !important;
			}
			button#buttonRecupera {
				margin-bottom: 5px !important;
			}
			.ml-auto.mr-auto.col.col-md-12.position-relative.mt-2.mb-2 {
				display: none;
			}
			.col-md-5.col-xs-11.login-sec.m-auto {
				height: 300px !important;
				width: 80%;
			}
			body{
				background-color: #fff !important;
			}
			.login-form .form-group {
				margin-bottom: 10px !important;
			}
		}
		footer .container {
			margin-top: 0px !important;
		}
		@media (max-width:1550px) {
			section#home {
				z-index: 99;
				zoom: .9;
			}
		}
        div#respuesta_login2 div {
            padding: 15px !important;
            background-color: #dfdfdf !important;
            color: #002795 !important;
            border-radius: 4px !important;
            font-size: 1rem !important;
            text-align: center !important;
            font-weight: normal;
        }
	
	

</value>
      <webElementGuid>bea86998-8700-4922-9884-c69a0127e13b</webElementGuid>
   </webElementProperties>
   <webElementProperties>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>xpath</name>
      <type>Main</type>
      <value>id(&quot;e_apo_com&quot;)</value>
      <webElementGuid>b68e79cf-13e6-4e00-87d9-8d0005b80a5b</webElementGuid>
   </webElementProperties>
   <webElementXpaths>
      <isSelected>true</isSelected>
      <matchCondition>equals</matchCondition>
      <name>xpath:attributes</name>
      <type>Main</type>
      <value>//select[@id='e_apo_com']</value>
      <webElementGuid>cfced7c0-1b58-46cd-97d5-f5db6306f2df</webElementGuid>
   </webElementXpaths>
   <webElementXpaths>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>xpath:idRelative</name>
      <type>Main</type>
      <value>//form[@id='editApoForm']/table/tbody/tr[6]/td[3]/select</value>
      <webElementGuid>88d6afe8-45cd-434e-bca6-5517bc163d7b</webElementGuid>
   </webElementXpaths>
   <webElementXpaths>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>xpath:position</name>
      <type>Main</type>
      <value>//tr[6]/td[3]/select</value>
      <webElementGuid>62421610-282b-426f-afeb-86186f12f103</webElementGuid>
   </webElementXpaths>
   <webElementXpaths>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>xpath:customAttributes</name>
      <type>Main</type>
      <value>//select[@id = 'e_apo_com' and @name = 'e_apo_com' and (text() = concat(&quot;    



	
		
		
		
		
		
		
		
		WebClass Software | Ingreso Plataforma
		

		
		

		
		
		
		
		
		
		
		
		
		
			
			$(document).ready(inicializarPagina);
			function inicializarPagina()
			{	
				$(&quot;#respuesta_login&quot;).hide();
				$(&quot;#respuesta_login2&quot;).hide();
				$(&quot;section#reiniciar-pass-form-container&quot;).hide();
				$(&quot;section#solicitar-pass-form-container&quot;).hide();
				$(&quot;.mostrar-selclass&quot;).hide();
				$(&quot;#regresar-selclass&quot;).hide();
				if (window.location.hash == &quot; , &quot;'&quot; , &quot;#recuperar&quot; , &quot;'&quot; , &quot;) {
					$(&quot;#inputUsuario&quot;).val(&quot; , &quot;'&quot; , &quot;&quot; , &quot;'&quot; , &quot;);
					$(&quot;#inputUsuario2&quot;).val(&quot; , &quot;'&quot; , &quot;&quot; , &quot;'&quot; , &quot;);
					$(&quot;#inputPass&quot;).val(&quot; , &quot;'&quot; , &quot;&quot; , &quot;'&quot; , &quot;);
					$(&quot;section#signup-form-container&quot;).hide();
					$(&quot;#respuesta_login&quot;).hide();
					$(&quot;#respuesta_login2&quot;).hide();
					$(&quot;section#reiniciar-pass-form-container&quot;).show();
					$(&quot;reiniciar-pass-form&quot;).show();
				}
				if (window.location.hash == &quot; , &quot;'&quot; , &quot;#selclass&quot; , &quot;'&quot; , &quot;) {
					$(&quot;#inputUsuario&quot;).val(&quot; , &quot;'&quot; , &quot;&quot; , &quot;'&quot; , &quot;);
					$(&quot;#inputUsuario2&quot;).val(&quot; , &quot;'&quot; , &quot;&quot; , &quot;'&quot; , &quot;);
					$(&quot;#inputPass&quot;).val(&quot; , &quot;'&quot; , &quot;&quot; , &quot;'&quot; , &quot;);
					$(&quot;section#signup-form-container&quot;).hide();
					$(&quot;#respuesta_login&quot;).hide();
					$(&quot;#respuesta_login2&quot;).hide();
					$(&quot;section#reiniciar-pass-form-container&quot;).show();
					$(&quot;reiniciar-pass-form&quot;).show();
					$(&quot;.login-sec&quot;).addClass(&quot;login-sec-selclass&quot;);
					$(&quot;.login-sec-selclass&quot;).removeClass(&quot;login-sec&quot;);
					$(&quot;.mostrar-webclass&quot;).hide();
					$(&quot;.mostrar-selclass&quot;).show();
					$(&quot;#regresar-selclass&quot;).show();
					$(&quot;#regresar&quot;).hide();	
					$(&quot;.footer-section&quot;).hide();	
				}
				$(&quot;#inputUsuario&quot;).keyup(function(e)
				{
					if( e.which == 13 )
						$(&quot;#button&quot;).click( switchUsuario(1) );
				});

				$(&quot;#inputPass&quot;).keyup(function(e)
				{
					if( e.which == 13 )
						$(&quot;#button2&quot;).click( switchUsuario(1) );
				});

				$(&quot;#button&quot;).keyup(function(e)
				{
					if( e.which == 13 )
						$(&quot;#button&quot;).click( switchUsuario(1) );
				});

				$(&quot;#inputUsuario2&quot;).keyup(function(e)
				{
					if( e.which == 13 )
					{
						$(&quot;#button2&quot;).click( switchUsuario(2) );
					}
				});

				$(&quot;#button2&quot;).keyup(function(e)
				{
					if( e.which == 13 )
					{
						$(&quot;#button2&quot;).click( switchUsuario(2) );
					}
				});
				$(&quot;#recuperar&quot;).click(recuperarClave);	
				$(&quot;#solicitar&quot;).click(solicitarClave);		
			}
			function recuperarClave()
			{
				$(&quot;#inputUsuario&quot;).val(&quot; , &quot;'&quot; , &quot;&quot; , &quot;'&quot; , &quot;);
				$(&quot;#inputUsuario2&quot;).val(&quot; , &quot;'&quot; , &quot;&quot; , &quot;'&quot; , &quot;);
				$(&quot;#inputPass&quot;).val(&quot; , &quot;'&quot; , &quot;&quot; , &quot;'&quot; , &quot;);
				$(&quot;section#signup-form-container&quot;).hide();
				$(&quot;#respuesta_login&quot;).hide();
				$(&quot;#respuesta_login2&quot;).hide();
				$(&quot;section#reiniciar-pass-form-container&quot;).show();
				$(&quot;form#reiniciar-pass-form&quot;).show();
			}	
			function solicitarClave()
			{
				$(&quot;#inputUsuario&quot;).val(&quot; , &quot;'&quot; , &quot;&quot; , &quot;'&quot; , &quot;);
				$(&quot;#inputUsuario2&quot;).val(&quot; , &quot;'&quot; , &quot;&quot; , &quot;'&quot; , &quot;);
				$(&quot;#inputPass&quot;).val(&quot; , &quot;'&quot; , &quot;&quot; , &quot;'&quot; , &quot;);
				$(&quot;section#signup-form-container&quot;).hide();
				$(&quot;#respuesta_login&quot;).hide();
				$(&quot;#respuesta_login2&quot;).hide();
				$(&quot;section#solicitar-pass-form-container&quot;).show();
				$(&quot;form#solicitar-pass-form&quot;).show();
			}	
		
	
	
		
		
				

		
			
				
					
						
							
								Bienvenidos
							
							
							
								
									Usuario
									
								
								
									Contraseña
									
								
								
								
									Ingresar
									
										
											Olvidé mi contraseña
										
										
											No tengo usuario
										
									
								
								
								
							
							
                                
                                
							
						
						
							
								
									Cambiar contraseña
								
								
									
										
										
									
									
										
										Escribe tu usuario para restablecer la contraseña
										
										
											Usuario
											
										
										
											Enviar
											
											
												Regresar
												Regresar
											
										
										
										
									
								
							
						
						
							
								
									
										
									
									
										
											Estimado usuario.
										
										
											
												
													Para crear su contraseña de acceso, debe comunicarse con el WebClass Manager de su Colegio.
											
										
										
											Gracias.
										
										
									
									
											
												Regresar
											
										
								
							
						
					
					
						
					
				
			
		

		
			

				
				
					
						
							
								
									Síguenos en nuestras redes
									
										
										
											
												
											
										
										
											
												
											
										
									
								
							
							
								
									Conoce otros servicios
									
										SELChile
										NEWS
										PAE
										WebClass Suite
										VirtualClass
									
								
							
							
								
									Portales de Educación
									
										MINEDUC
										Agencia de la Calidad
										Superintendencia
										Consejo Nacional
										Educar Chile
									
								
							
							
								
									Oficina Central
									Av. del Valle Norte 961, Of. 5704 Ciudad Empresarial - Huechuraba Santiago, Chile
									Fono Soporte: +56 2 2869 9100
									Fono Empresa: +56 2 2656 7574
									Fono Ventas: +56 2 2656 7634
									Email: ventas@webclass.com
								
							
						
					
					
						
							
								
									
										© 2025 WebClass.com | Todos los derechos reservados.
									
									
										
										
									
								
							
						
					
				
				
			
		
		
		
		

	
		@media (width:500px) {
			section#home {
				background: none !important;
				background-color: #fff !important;
				height: 350px;
			}
			.logo-slider img {
				width: 50% !important;
				margin-bottom: 10px !important;
			}
			.footer-section {
				display: none;
			}
			.login-form p#instrucciones-form {
				font-size: 14px;
			}
			section#reiniciar-pass-form-container {
				padding: 0px !important;
			}
			section#home {
				padding-top: 25px !important;
			}
			button#buttonRecupera {
				margin-bottom: 5px !important;
			}
			.ml-auto.mr-auto.col.col-md-12.position-relative.mt-2.mb-2 {
				display: none;
			}
			.col-md-5.col-xs-11.login-sec.m-auto {
				height: 300px !important;
				width: 80%;
			}
			body{
				background-color: #fff !important;
			}
			.login-form .form-group {
				margin-bottom: 10px !important;
			}
		}
		footer .container {
			margin-top: 0px !important;
		}
		@media (max-width:1550px) {
			section#home {
				z-index: 99;
				zoom: .9;
			}
		}
        div#respuesta_login2 div {
            padding: 15px !important;
            background-color: #dfdfdf !important;
            color: #002795 !important;
            border-radius: 4px !important;
            font-size: 1rem !important;
            text-align: center !important;
            font-weight: normal;
        }
	
	

&quot;) or . = concat(&quot;    



	
		
		
		
		
		
		
		
		WebClass Software | Ingreso Plataforma
		

		
		

		
		
		
		
		
		
		
		
		
		
			
			$(document).ready(inicializarPagina);
			function inicializarPagina()
			{	
				$(&quot;#respuesta_login&quot;).hide();
				$(&quot;#respuesta_login2&quot;).hide();
				$(&quot;section#reiniciar-pass-form-container&quot;).hide();
				$(&quot;section#solicitar-pass-form-container&quot;).hide();
				$(&quot;.mostrar-selclass&quot;).hide();
				$(&quot;#regresar-selclass&quot;).hide();
				if (window.location.hash == &quot; , &quot;'&quot; , &quot;#recuperar&quot; , &quot;'&quot; , &quot;) {
					$(&quot;#inputUsuario&quot;).val(&quot; , &quot;'&quot; , &quot;&quot; , &quot;'&quot; , &quot;);
					$(&quot;#inputUsuario2&quot;).val(&quot; , &quot;'&quot; , &quot;&quot; , &quot;'&quot; , &quot;);
					$(&quot;#inputPass&quot;).val(&quot; , &quot;'&quot; , &quot;&quot; , &quot;'&quot; , &quot;);
					$(&quot;section#signup-form-container&quot;).hide();
					$(&quot;#respuesta_login&quot;).hide();
					$(&quot;#respuesta_login2&quot;).hide();
					$(&quot;section#reiniciar-pass-form-container&quot;).show();
					$(&quot;reiniciar-pass-form&quot;).show();
				}
				if (window.location.hash == &quot; , &quot;'&quot; , &quot;#selclass&quot; , &quot;'&quot; , &quot;) {
					$(&quot;#inputUsuario&quot;).val(&quot; , &quot;'&quot; , &quot;&quot; , &quot;'&quot; , &quot;);
					$(&quot;#inputUsuario2&quot;).val(&quot; , &quot;'&quot; , &quot;&quot; , &quot;'&quot; , &quot;);
					$(&quot;#inputPass&quot;).val(&quot; , &quot;'&quot; , &quot;&quot; , &quot;'&quot; , &quot;);
					$(&quot;section#signup-form-container&quot;).hide();
					$(&quot;#respuesta_login&quot;).hide();
					$(&quot;#respuesta_login2&quot;).hide();
					$(&quot;section#reiniciar-pass-form-container&quot;).show();
					$(&quot;reiniciar-pass-form&quot;).show();
					$(&quot;.login-sec&quot;).addClass(&quot;login-sec-selclass&quot;);
					$(&quot;.login-sec-selclass&quot;).removeClass(&quot;login-sec&quot;);
					$(&quot;.mostrar-webclass&quot;).hide();
					$(&quot;.mostrar-selclass&quot;).show();
					$(&quot;#regresar-selclass&quot;).show();
					$(&quot;#regresar&quot;).hide();	
					$(&quot;.footer-section&quot;).hide();	
				}
				$(&quot;#inputUsuario&quot;).keyup(function(e)
				{
					if( e.which == 13 )
						$(&quot;#button&quot;).click( switchUsuario(1) );
				});

				$(&quot;#inputPass&quot;).keyup(function(e)
				{
					if( e.which == 13 )
						$(&quot;#button2&quot;).click( switchUsuario(1) );
				});

				$(&quot;#button&quot;).keyup(function(e)
				{
					if( e.which == 13 )
						$(&quot;#button&quot;).click( switchUsuario(1) );
				});

				$(&quot;#inputUsuario2&quot;).keyup(function(e)
				{
					if( e.which == 13 )
					{
						$(&quot;#button2&quot;).click( switchUsuario(2) );
					}
				});

				$(&quot;#button2&quot;).keyup(function(e)
				{
					if( e.which == 13 )
					{
						$(&quot;#button2&quot;).click( switchUsuario(2) );
					}
				});
				$(&quot;#recuperar&quot;).click(recuperarClave);	
				$(&quot;#solicitar&quot;).click(solicitarClave);		
			}
			function recuperarClave()
			{
				$(&quot;#inputUsuario&quot;).val(&quot; , &quot;'&quot; , &quot;&quot; , &quot;'&quot; , &quot;);
				$(&quot;#inputUsuario2&quot;).val(&quot; , &quot;'&quot; , &quot;&quot; , &quot;'&quot; , &quot;);
				$(&quot;#inputPass&quot;).val(&quot; , &quot;'&quot; , &quot;&quot; , &quot;'&quot; , &quot;);
				$(&quot;section#signup-form-container&quot;).hide();
				$(&quot;#respuesta_login&quot;).hide();
				$(&quot;#respuesta_login2&quot;).hide();
				$(&quot;section#reiniciar-pass-form-container&quot;).show();
				$(&quot;form#reiniciar-pass-form&quot;).show();
			}	
			function solicitarClave()
			{
				$(&quot;#inputUsuario&quot;).val(&quot; , &quot;'&quot; , &quot;&quot; , &quot;'&quot; , &quot;);
				$(&quot;#inputUsuario2&quot;).val(&quot; , &quot;'&quot; , &quot;&quot; , &quot;'&quot; , &quot;);
				$(&quot;#inputPass&quot;).val(&quot; , &quot;'&quot; , &quot;&quot; , &quot;'&quot; , &quot;);
				$(&quot;section#signup-form-container&quot;).hide();
				$(&quot;#respuesta_login&quot;).hide();
				$(&quot;#respuesta_login2&quot;).hide();
				$(&quot;section#solicitar-pass-form-container&quot;).show();
				$(&quot;form#solicitar-pass-form&quot;).show();
			}	
		
	
	
		
		
				

		
			
				
					
						
							
								Bienvenidos
							
							
							
								
									Usuario
									
								
								
									Contraseña
									
								
								
								
									Ingresar
									
										
											Olvidé mi contraseña
										
										
											No tengo usuario
										
									
								
								
								
							
							
                                
                                
							
						
						
							
								
									Cambiar contraseña
								
								
									
										
										
									
									
										
										Escribe tu usuario para restablecer la contraseña
										
										
											Usuario
											
										
										
											Enviar
											
											
												Regresar
												Regresar
											
										
										
										
									
								
							
						
						
							
								
									
										
									
									
										
											Estimado usuario.
										
										
											
												
													Para crear su contraseña de acceso, debe comunicarse con el WebClass Manager de su Colegio.
											
										
										
											Gracias.
										
										
									
									
											
												Regresar
											
										
								
							
						
					
					
						
					
				
			
		

		
			

				
				
					
						
							
								
									Síguenos en nuestras redes
									
										
										
											
												
											
										
										
											
												
											
										
									
								
							
							
								
									Conoce otros servicios
									
										SELChile
										NEWS
										PAE
										WebClass Suite
										VirtualClass
									
								
							
							
								
									Portales de Educación
									
										MINEDUC
										Agencia de la Calidad
										Superintendencia
										Consejo Nacional
										Educar Chile
									
								
							
							
								
									Oficina Central
									Av. del Valle Norte 961, Of. 5704 Ciudad Empresarial - Huechuraba Santiago, Chile
									Fono Soporte: +56 2 2869 9100
									Fono Empresa: +56 2 2656 7574
									Fono Ventas: +56 2 2656 7634
									Email: ventas@webclass.com
								
							
						
					
					
						
							
								
									
										© 2025 WebClass.com | Todos los derechos reservados.
									
									
										
										
									
								
							
						
					
				
				
			
		
		
		
		

	
		@media (width:500px) {
			section#home {
				background: none !important;
				background-color: #fff !important;
				height: 350px;
			}
			.logo-slider img {
				width: 50% !important;
				margin-bottom: 10px !important;
			}
			.footer-section {
				display: none;
			}
			.login-form p#instrucciones-form {
				font-size: 14px;
			}
			section#reiniciar-pass-form-container {
				padding: 0px !important;
			}
			section#home {
				padding-top: 25px !important;
			}
			button#buttonRecupera {
				margin-bottom: 5px !important;
			}
			.ml-auto.mr-auto.col.col-md-12.position-relative.mt-2.mb-2 {
				display: none;
			}
			.col-md-5.col-xs-11.login-sec.m-auto {
				height: 300px !important;
				width: 80%;
			}
			body{
				background-color: #fff !important;
			}
			.login-form .form-group {
				margin-bottom: 10px !important;
			}
		}
		footer .container {
			margin-top: 0px !important;
		}
		@media (max-width:1550px) {
			section#home {
				z-index: 99;
				zoom: .9;
			}
		}
        div#respuesta_login2 div {
            padding: 15px !important;
            background-color: #dfdfdf !important;
            color: #002795 !important;
            border-radius: 4px !important;
            font-size: 1rem !important;
            text-align: center !important;
            font-weight: normal;
        }
	
	

&quot;))]</value>
      <webElementGuid>bea0e416-9143-4563-a90d-f6bb6e542750</webElementGuid>
   </webElementXpaths>
</WebElementEntity>
