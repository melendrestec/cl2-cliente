<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core_rt" %>
<!DOCTYPE html>
<html lang="esS">
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no">
<link href="css/bootstrap.min.css" rel="stylesheet">
<link href="css/bootstrap-theme.min.css" rel="stylesheet">
<link href="css/bootstrapValidator.min.css" rel="stylesheet">
<link href="css/bootstrap-datepicker.css" rel="stylesheet">
<link href="css/dataTables.bootstrap.min.css" rel="stylesheet">
<link href="css/bootstrapValidator.min.css" rel="stylesheet">
<script type="text/javascript" src="js/jquery.min.js"></script>
<script type="text/javascript" src="js/bootstrap.min.js"></script>
<script type="text/javascript" src="js/bootstrapValidator.min.js"></script>
<script type="text/javascript" src="js/jquery.dataTables.min.js"></script>
<script type="text/javascript" src="js/dataTables.bootstrap.min.js"></script>
<script type="text/javascript" src="js/bootstrap-datepicker.min.js"></script>
<script type="text/javascript" src="sweetalert/sweetalert.min.js"></script>




<title>Consulta-Libro</title>
<style>
	.modal-header, h4, .close {
		background-color: #286090;
		color: white !important;
		text-align: center;
		font-size: 20px;
	}
	.btn-warning,.btn-info{
		width: 100px;
	}
	.btn-danger,.btn-primary{
		width: 160px;
	}
</style> 
</head>
<body>
	<div class="container">
		<h3 align="center">Consulta Productos</h3>	
		<form class="form-inline">	
		                   
		                                	<div class="form-group">
			                                   	<label for="staticEmail">Precio 1</label>
												<input class="form-control" id="idPrecio1" name="pre1" placeholder="Ingrese Precio 1"/>
												<label for="staticEmail">Precio 2</label>
												<input class="form-control" id="idPrecio2" name="pre2" placeholder="Ingrese Precio 2"/>
													<button type="button" class="btn btn-primary" id="validatetBtn">Consulta</button>
			                                </div> 
			                                
		</form>
		<br><p>
		
		
			<div id="divEmpleado">
		 								<table id="id_table" class="table table-striped table-bordered" >
												<thead>
														<tr>
															<th>Codigo</th>
															<th>Nombre</th>
															<th>Marca</th>
															<th>Precio</th>
															<th>Stock</th>
														</tr>
												</thead>
												<tbody>

												</tbody>
											</table>	

			</div>	
	</div>


<script type="text/javascript">
$(".btn-primary").click(function(){
	var prec1;
	var prec2;
	prec1=$("#idPrecio1").val();
	prec2=$("#idPrecio2").val();
	
	$("#id_table tbody").empty();
	
	$.getJSON("listAllProductoAtPrecio",{pre1:prec1,pre2:prec2},function (response){
		$.each(response.listaProducto,function(index,item){
			$("#id_table").append("<tr><td>"+item.codigo+"</td><td>"+item.nombre+"</td><td>"+item.marca+"</td><td>"+item.precio+"</td><td>"+item.stock+"</td></tr>"); 
	
		})
	})
	
	
})

</script>

</body>
</html>












