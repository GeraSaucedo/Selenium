
public class Apuntes {
	
	public static void main(String [] args) {
		System.out.print("APUNTES");
	}
//INTRODUCTION TO AUTOMATION
	/*
	 * AUTOMATION: Es una tecnica que provee eficiencia y eficacia
	 * CUANDO AUTOMATIZAR?
	 * siempre y cuando los proyectos cuenten con las caracterizticas:
	 * -	testing en alguna areas
	 * -	requerimientos estables y con frecuencia
	 * 
	 *  AUTOMATION PROCESS:
	 *  - identificar las areas que requeren testing
	 *  - seleccionar la herramienta de automatizacion apropiada
	 *  - write test script
	 *  - develop test suits
	 *  - Execute test scripts
	 * 	- create a result report
	 *  - identifiy any potential bugs or performance issue
	 *  
	 *  INTRODUCCION A SELENIUM
	 *  - Libreria open source que automatiza browsers
	 *  
	 * SELENIUM TIENE 4 COMPONENTES PRINCIPALES
	 * SLENIUM IDntegrated develompent enviroment (deprecated)
	 * SELENIUM REMOTE CONTROL (deprecated)
	 * SELENIM WEB DRIVER 
	 * SELENIUM GRID
	 * 
	 * SELENIUM LENGUAGE INDINGS> java, ruby, C#, python, javascript
	 * json files: mandan peticiones al servidor
	 * JSON WIRE PROTOCOL
	 * 
	 * 
	 * browser nativo por defecto de selenium era FIREFOX 
	 * 
	 * safari Driver(Deprecated / solo en IOS 11+)
	 * a partir de version 3
	 * 
	 * ARQUITECTURA
	 * ---------------Search cotext(I)
	 * ------------WebDriver(I)
	 * -----------RemoteWebDriver(C)
	 * ---------CHromeDriver -----FIREFOXDIRVER------IE DRIVER
	 * 
	 * Jason Huggings - creador selenium
	 * Simon Stewart  - creador web driver
	 * 
	 * 
	 * SELENIUM LOCATORS: IMPORTANTE IMPORTANTE IMPORTANTE IMPORTANTE
	 * siempre tener en cuenta que las etiquetas HTML se basan en Key-Value
	 * Locator types>
	 * 	- ID
	 *  - NAME
	 *  - XPATH
	 *  - CSS SELECTOR
	 *  - XPATH
	 *  
	 *  XPATH: Localizador de formatos XML
	 *  
	 *  XPATH ABSOLUTO:
	 *  	es la forma directa de encontrar un elemento 
	 *  	empiezan con "/"
	 *  XPATH RELATIVO:
	 *  
	 *  			XPATH = //tagname[@attribute='value']
	 *  
	 *  	- Comienzan con "//" que quiere decir que puede buscar en cualquier parte de la pagina
	 *  	> //  -  Select current node
	 *  	> Tagname - tagname of the particular node
	 *  	> @	- Select atribute
	 *  	> Attribute - nombre del atributo
	 *  	> value - Valor del atributo
	 *  
	 *  	POR EJ:
	 *  			//a[@id=link]
	 *  
	 *  		NOTA: NO CREAR XPATH CON IDS YA QUE EL ID ES UNICO POR LO QUE SE PUEDE BUSCAR EL ELEMENTO CON EL ID
	 *  			ES DECIR, HACER USO DEL XPATH CUANDO NO SE TIENE ID O ES ID DINAMICO
	 *  
	 *  PRIORIDAD DE IDENTIFICADORES
	 *  	> ID
	 *  	> NAME
	 *  	> XPATH
	 *  	> CSS SELECTOR
	 *  	> PARTIALLINK - LINKTEXT
	 *  	> CLASS 
	 *  
	 *  GOOOGLE------
	 *  XPATH DE EJERCICIOS:
	 *  SEARCH: 					//*[@id="lst-ib"]
	 *  GMAIL: 						//a[text()="Gmail"]
	 *  BOTON INICIAR SESION:		//a[contains(@target,"_top")]    |    //a[text()="Iniciar sesión"]
	 *  BOTON ME SIENTO SUERTE:  	//input[@value="Me siento con suerte "]
	 * 	
	 * 	DEMOQA.COM
	 *  DRAGGABLE					//a[@title="Draggable"]
	 *  HOME BUTTON					//a[@title="Home"]
	 *  IMG							(//img[@alt="pattern-14"])[2]
	 *  Registro:					//a[text()="Registration"]
	 *  Slectable: 					//a[text()="Selectable"]
	 *  
	 *  UDEMY;;;
	 *  LOGO 						(//img[@alt="Udemy"])[1]
	 *  Search 						//input[@data-purpose="search-input"]
	 *  carro						//span[contains(@class,"cart")]
	 *  Log in						//button[@data-purpose="header-login"]   |		
	 *  search box 2 				//input[@data-purpose="home-quick-search-box"]
	 *  
	 *  SDETS / DEVOPS
	 * 
	 * 
	 * Explorar la aplicacion
	 * revisar requerimientos
	 * seleccionar heramienta automatizacion (segun el tipo de aplicacion si es web browser, mobile, etc)
	 * hacer los test cases
	 * suit de pruebas
	 * generar reportes
	 * defectos
	 * 
	 * 
	 * 
	 * SELECTORES CSS>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>.
	 * 
	 * # - id
	 * . - Clase
	 * tagname
	 * 
	 * PSEUDO SELECTORES:
	 * 		siempre comienzan con ":" (dos puntos)
	 * 	- :nth-child(#)  (se puede usar en casi todos los elementos por ej una lista)  
	 * 	- :not(tagname)
	 * 	- :first-child
	 *  - :last-child
	 *  
	 *  por ej :nth-child         
	 *  		(parecido al xpath relativo)		ul lu:first-child  		nos devuelve el nombre daniela
	 *  		(parecido al xpath absoluto)		#menu li:first-child  	nos devuelve el nombre daniela
	 *  	<ul>
	 *  	<li>Daniela</li>
	 *  	<li>Edson</li>
	 *  	<li>Celeste</li>
	 *  	</ul>
	 *  
	 *  ABSOLUTO
	 *  <ul>
	 *  <li>
	 *  	<p>
	 *  		<a href="">Jerry</a>
	 *  	</p>
	 *  </li>
	 *  </ul>
	 *  
	 *  Para llegar a la etiqueta a se hace de la fora
	 *  
	 *  Absoluto: 	ul>li:first-child>p>a
	 *  Relativo:	ul li:first-child a		
	 *  
	 *  demoqa.com seleccionar boton tab menu derecha:	#menu-widget li:nth-child(6)  .menu li:nth-child(6)
	 *  
	 *  .col-md-4:nth-child(3) img
	 * 	
	 * 
	 * 
	 * WAITS---------------------------------
	 * 1. EXPLICIT 			-> MAS USADO
	 * 2. IMPLICIT
	 * 3. FLUENT			-> MENOS USADO / MAS AVANZADO
	 * 
	 * Explicit: Nos da tiempo de espera si cumple condiciones indicadas 
	 * Implicito: mala practica ya que el implicito le da el mismo tiempo indicado a todos los elementos
	 * Fluent: hibrido entre empliit e implicit 
	 * 
	 * 
	 * PREGUNTAS que hay que saber:
	 * What is selenium?
	 * diferencia entre xpath relativo y abosluto
	 * formato del xpathy css selector
	 * fundador selenium
	 * fundador webdriver
	 * tipos de localizadores
	 * PROCESO DE AUTOMATIZACION
	 * que es automation
	 * cuando hacer automation: ambiente estable
	 * Selenium version mas recientes
	 * lenguajes de programacion
	 * 
	 * 
	 * BUENAS PRACTICAS:
	 * - try catch a ver si cargo la pagina
	 * - usar xpath relativos
	 * - no usar datos reales en los test
	 * 
	 * COMPONENTES DEL CORE DE SLELENIUM
	 * - IDE 
	 * - remote control
	 * - grid  -  mandar ejecuciones paralelas a diferentes maquinas o browers
	 * 
	 * WebDriverWait varWait = new WebDriverWait(driver,10);
	 * WebElement element = driver.findElement(By.name("q"))
	 * varWait.until(ExpectedConditions.visibulityOf(element)).sendKeys("Hola!");
	 * 
	 * 
	 * >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>PAGE OBJECT MODEL>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
	 * POM: es un patron de disenio de objetos donde las paginas estan representadas como objetos y las clases como variables
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 */
	
}
