email = de.hybris.platform.util.mail.MailUtils.getPreconfiguredEmail()
email.addTo("souraduttadcx@gmail.com")
email.subject="Email from DCXBookmania"
email.msg = "Congratulations! Welcome to DCXBookmania"
email.send()