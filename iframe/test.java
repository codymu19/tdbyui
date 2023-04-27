// Get the iFrame element
		const myIframe = document.getElementById("my-iframe");

		// Resize the iFrame when the content changes
		myIframe.addEventListener("load", function() {
			myIframe.style.height = myIframe.contentWindow.document.body.scrollHeight + "px";
		});

		// Make the iFrame resizable
		window.addEventListener("resize", function() {
			myIframe.style.height = myIframe.contentWindow.document.body.scrollHeight + "px";
		});
