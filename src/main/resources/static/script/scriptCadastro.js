document.addEventListener("DOMContentLoaded", () => {
	
	const form = document.getElementById("cadastroClienteForm");
	
	form.addEventListener("submit", async (event) => {
		event.preventDefault();
		
		const nomeCliente = document.getElementById("nome").value;
		const cpf = document.getElementById("cpf").value;
		const email = document.getElementById("email").value;
		const telefone = document.getElementById("telefone").value;
		const dt_nascimento = document.getElementById("dt_nascimento").value;
		const senha = document.getElementById("Senha").value;
		
		try{
			
			const response = await fetch ("https://localhost:8080/usuario", {
				method: "POST",
				headers: {
					"Content-Type": "application/json"
				},
				body: JSON.stringify({
					nomeCliente,
					cpf,
					email,
					telefone,
					dt_nascimento,
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