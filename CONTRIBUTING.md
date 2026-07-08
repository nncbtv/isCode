# Guida alla Contribuzione

Per garantire la stabilità del progetto, il ramo principale (`main`) è protetto.  
Se hai trovato un errore, vuoi ottimizzare un pattern o aggiungere dei riassunti, segui questa guida per segnalarci e inviarci la tua modifica.

---

## Come segnalare e inviare una modifica

Il flusso standard per proporre modifiche si basa sulle **Pull Request** di GitHub. Ecco i passaggi esatti da seguire:

### 1. Clona la Repository

Se non l'hai già fatto, scarica la repository sul tuo computer locale usando il terminale:
```bash
git clone https://github.com/nncbtv/isCode.git
cd isCode
```

### 2. Crea un nuovo branch su cui lavorare
Inserisci tutte le tue modifiche in un nuovo branch con il comando:
```bash
git checkout -b sviluppoNomeModifica
```
> Esempio: git checkout -b sviluppoSingletonThreadSafe

### 3. Apporta le modifiche

Modifica il codice o aggiungi file rispettando la struttura delle cartelle:

- **designPattern/** *qui metterai tutte le modifiche riguardo un pattern*
- **diagrammiUML/** *qui metterai tutte le modifiche riguardo i diagrammi UML*
- **riassuntiTeoria/** *qui metterai un nuovo riassunto o una correzione per gli argomenti teorici*

Se si modifica il codice di un pattern aggiornare anche la documentazione e il diagramma UML se necessario

Nel file word ***comandiGit.docx*** puoi aggiungere un nuovo comando che vuoi ricordare con spiegazione annessa

### 4. Salva in locale la tua modifica
Salva le modifiche sul tuo branch locale e caricale sul tuo spazio GitHub:
```bash
git add .
git commit -m "Descrizione chiara della modifica fatta"
git push origin sviluppoNomeModifica
```
Esempio: 
> 1. git add .
> 2. git commit -m "Modifica Pattern: Singleton, aggiunta funzionalità thread safe"
> 3. git push origin sviluppoSingletonThreadSafe ***(Identico al nome scelto in precedenza)***

### 5. Apri una pull request e aggiungi la tua parte

1. Torna sulla pagina GitHub del progetto: https://github.com/nncbtv/isCode
2. Vedrai comparire un banner giallo con scritto **Compare & pull request**, Cliccaci sopra.
3. Descrivi brevemente nel box di testo:
     * Quale modifica hai aggiunto
     * Perché hai fatto questa modifica e cosa hai risolto
4. Clicca su **Create pull request**

## Cosa succede dopo?

Gli amministratori della repository riceveranno una notifica, l'eleborato verrà visionato per assicurarsi che sia corretto o quanto meno inerente ed infine verrà aggiunto diventando visibile a tutti :)
