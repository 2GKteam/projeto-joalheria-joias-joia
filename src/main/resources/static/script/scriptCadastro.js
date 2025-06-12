document.addEventListener("DOMContentLoaded", () => {
	const form = document.getElementById("cadastroClienteForm");

	form.addEventListener("submit", async (event) => {
		event.preventDefault();

		const nomeUsuario = document.getElementById("nome").value;
		const cpf = document.getElementById("cpf").value;
		const email = document.getElementById("email").value;
		const telefone = document.getElementById("telefone").value;
		const dataNascimento = document.getElementById("dt_nascimento").value;
		const senha = document.getElementById("senha").value;

		try {
			const response = await fetch("http://localhost:8080/usuarios", {
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
						idTipoUsuario: 2
					}
				}),
			});
			
			if(!response.ok) {
				throw new Error('Erro ao cadastrar usuário');
			}
			window.location.href='./endereco.html';
			
			} catch(error){
		      console.error('Erro no cadastro:', error);
		                  alert('Falha ao cadastrar usuário. Tente novamente.');
		}
	});
});
