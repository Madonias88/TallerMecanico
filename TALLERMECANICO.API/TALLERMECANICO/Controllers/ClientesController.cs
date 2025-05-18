using TALLERMECANICO.Models;
using Microsoft.AspNetCore.Mvc;
using System.Collections.Generic;

namespace TALLERMECANICO.Controllers
{
    [Route("api/Clientes")]
    [ApiController]

    public class ClientesController : ControllerBase
    {
       
    private static readonly List<Cliente> _clientes = new()
    {
        new Cliente {
            Id = 1,
            Nombre = "María",
            Apellido = "González",
            Email = "maria@email.com",
            Telefono = "1234567890"
        },
        new Cliente {
            Id = 2,
            Nombre = "Pedro",
            Apellido = "Ramírez",
            Email = "pedro@email.com",
            Telefono = "0987654321"
        },
        new Cliente {
            Id = 3,
            Nombre = "Ana",
            Apellido = "Martínez",
            Email = "ana@email.com",
            Telefono = "5555555555"
        }
    };

        [HttpGet]
        public ActionResult<IEnumerable<Cliente>> Get()
        {
            return Ok(_clientes);
        }
    }
}


