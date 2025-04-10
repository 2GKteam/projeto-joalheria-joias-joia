document.addEventListener("DOMContentLoaded", () => {
	
	const form = document.getElementById("cadastroClienteForm");
	
	form.addEventListener("submit", async (event) => {
		event.preventDefault();
		
		const nomeUsuario = document.getElementById("nome").value;
		const cpf = document.getElementById("cpf").value;
		const email = document.getElementById("email").value;
		const telefone = document.getElementById("telefone").value;
<<<<<<< HEAD
		const dataNascimento = document.getElementById("dt_nascimento").value;
		const senha = document.getElementById("senha").value;
=======
		const dt_nascimento = document.getElementById("dt_nascimento").value;
		const senha = document.getElementById("senha").value;

		
		try{
			
			const response = await fetch ("http://localhost:8080/usuarios", {
		const senha = document.getElementById("Senha").value;
>>>>>>> 535915f8af62aa617de81584ec8daeac1c18da56
		
		try{
			
			const response = await fetch ("http://localhost:8080/usuarios", {
				method: "POST",
				headers: {
					"Content-Type": "application/json"
				},
				body: JSON.stringify({
					nomeUsuario,
					cpf,
					email,
					telefone,
					dataNascimento,
					senha,
					tipoUsuario: {
						id: 2
					}	
				}), 
			});
			
			if (!response.ok) {
						alert("Erro ao cadastrar o cliente");
					} else {
						alert("cadastrado com sucesso");
						
						window.location.href = "endereco.html";
					}
				} catch (error) {
					console.error("Erro ao cadastrar o cliente:", error);
				}
		
	});
});