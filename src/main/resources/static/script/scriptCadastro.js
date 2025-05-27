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
						idTipoUsuario: 2
					}
				}),
			});

<<<<<<< HEAD
			if(!response.ok) {
				throw new Error('Erro ao cadastrar usuário');
=======
			then(response => {
				if (response.ok) {
					return response.json();
				} else {
					throw new Error('Erro ao cadastrar usuário');
				}
			})

			if (!response.ok) {
				throw new Error('Erro ao cadastrar pessoa');
>>>>>>> 82bf835 (tentando arrumar a linha 33 de erro)
			}

			const data = await response.json();

			alert('Usuário cadastrado com sucesso!\nNomeUsuario: ' + data.nomeUsuario);
<<<<<<< HEAD
=======

			localStorage.setItem('pessoaId', data.idUsuario); // Confirme o nome da propriedade retornada pelo backend
>>>>>>> 82bf835 (tentando arrumar a linha 33 de erro)

			localStorage.setItem('pessoaId',data.idUsuario); // Verifique o nome correto da propriedade
			window.location.href='./endereco.html';

			} catch(error){
		      console.error('Erro no cadastro:', error);
		                  alert('Falha ao cadastrar usuário. Tente novamente.');
		}
	});
});
