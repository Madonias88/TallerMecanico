using Microsoft.AspNetCore.Mvc;
using System;
using System.Collections.Generic;
using System.Linq;

namespace TALLERMECANICO.Controllers
{
    [Route("api/[controller]")]
    [ApiController]
    public class FacturasController : ControllerBase
    {
        private static readonly List<Factura> _facturas = new()
        {
            new Factura { Id = 1, Fecha = DateTime.Now, ClienteNombre = "Carlos López", Total = 1500.00m, Items = new List<string> { "Cambio de aceite", "Filtro de aire" } },
            new Factura { Id = 2, Fecha = DateTime.Now, ClienteNombre = "María Pérez", Total = 2300.50m, Items = new List<string> { "Alineación", "Balanceo" } }
        };

        [HttpGet]
        public ActionResult<IEnumerable<Factura>> Get() => Ok(_facturas);

  
       }
}

