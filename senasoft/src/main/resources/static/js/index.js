document.addEventListener("DOMContentLoaded", function () {
    const form = document.getElementById("login-form");
    const identidadInput = document.getElementById("login-identidad");
    const fechaInput = document.getElementById("login-fecha_naci");
    const tipoDocumento = document.getElementById("opciones");

    form.addEventListener("submit", function (event) {
        event.preventDefault(); // Evita que el formulario se envíe directamente

        const identidad = identidadInput.value.trim();
        const fecha = fechaInput.value;
        const tipo = tipoDocumento.value;

        // Validación básica
        if (identidad === "" || fecha === "") {
            mostrarMensaje("⚠️ Por favor complete todos los campos.", "error");
            return;
        }

        if (isNaN(identidad)) {
            mostrarMensaje("❌ El número de identificación debe contener solo números.", "error");
            return;
        }

        // Simulación de validación exitosa
        mostrarMensaje("✅ Inicio de sesión exitoso. Bienvenido!", "success");

        // Puedes agregar aquí una redirección
        // window.location.href = "dashboard.html";
    });

    // Función para mostrar mensajes dinámicamente
    function mostrarMensaje(texto, tipo) {
        let mensaje = document.querySelector(".mensaje");

        if (!mensaje) {
            mensaje = document.createElement("div");
            mensaje.classList.add("mensaje");
            form.appendChild(mensaje);
        }

        mensaje.textContent = texto;
        mensaje.className = `mensaje ${tipo}`;

        // Se elimina después de unos segundos
        setTimeout(() => {
            mensaje.remove();
        }, 3000);
    }
});
