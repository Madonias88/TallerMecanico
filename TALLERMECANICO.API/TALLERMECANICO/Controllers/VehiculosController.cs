using TALLERMECANICO.Models;
using Microsoft.AspNetCore.Mvc;
using System.Collections.Generic;   

namespace TALLERMECANICO.Controllers
{
    [Route("api/Vehiculos")]
    [ApiController]
    public class VehiculosController : ControllerBase

    {
        
    private static readonly List<Vehiculo> _vehiculos = new()
    {
        new Vehiculo { Id = 1, Marca = "Toyota", Modelo = "Corolla", Placa = "ABC123", Año = 2020, Color = "Rojo" },
        new Vehiculo { Id = 2, Marca = "Honda", Modelo = "Civic", Placa = "XYZ789", Año = 2021, Color = "Azul" },
        new Vehiculo { Id = 3, Marca = "Ford", Modelo = "Focus", Placa = "DEF456", Año = 2019, Color = "Negro" }
    };

        [HttpGet]
        public ActionResult<IEnumerable<Vehiculo>> Get()
        {
            return Ok(_vehiculos);
        }

    }
}