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

		fetch("http://localhost:8080/usuarios", {
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
		})

			.then(response => {
				if (!response.ok) {
					throw new Error('Erro ao cadastrar pessoa');
				}
				return response.json(); // Pega o corpo da resposta (esperando que venha o objeto com id)
			})
			.then(data => {
				// Armazena o ID da pessoa no localStorage
				localStorage.setItem('pessoaId', data.idUsuario); // Supondo que o backend retorne { id: 1, ... }

				// Redireciona para a página de endereço
				window.location.href = './pages/cadastroEndereco.html';
			})
	})

		.catch(error => {
			// Mostra o erro no console
			console.error('Erro no cadastro:', error);
			alert('Falha ao cadastrar pessoa. Tente novamente.');
		});
});