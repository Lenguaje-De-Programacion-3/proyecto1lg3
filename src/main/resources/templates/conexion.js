function verCompradores() {
    fetch('http://172.20.10.3:8080/api/motos/DatosCliente')
        .then(response => response.json())
        .then(data => {
            console.log("Lista de compradores:");
            data.forEach(comprador => {
                console.log(`Nombre: ${comprador.nombre}, Cédula: ${comprador.cedula}, Correo: ${comprador.correo}`);
            });
        })
        .catch(error => console.error('Error:', error));
}

function registrarComprador(nombre, cedula, correo) {
    fetch('http://172.20.10.3:8080/api/motos/DatosCliente', {
        method: 'POST',
        headers: {
            'Content-Type': 'application/json'
        },
        body: JSON.stringify({
            nombre: nombre,
            cedula: cedula,
            correo: correo
        })
    })
    .then(response => response.json())
    .then(data => {
        console.log("Comprador registrado:", data);
    })
    .catch(error => console.error('Error:', error));
}
