class Module {
    /**
     * @param {String} moduleName
     */
    constructor(moduleName) {
        this.main = document.getElementById(moduleName);
    }
}

class PlayerInputModule extends Module {
    constructor() {
        super('playerPlayerSection');

        this.input = document.getElementById("savePlayerInput");
        document.getElementById("savePlayerButton")
            .onclick = (async () => {
                await this.savePlayerButtonAction(this)
            });
    }

    async savePlayerButtonAction(module) {
        try {
            let response = await axios.post("/api/player", {
                "name" : this.input.value
            });
            console.log(response);
            this.main.hidden = true;
            new SessionModule(response.data);
        } catch (error) {
            console.log(error);
        }
    }
}

class SessionModule extends Module {
    /**
     * @param {Player} player
     */
    constructor(player) {
        super('sessionSection');

        document.getElementById("playerNickName")
            .innerText = player.name;

        this.player = player;
    }
}

class Player {
    /**
     * @type {string}
     */
    name = undefined;

    /**
     * @type {number}
     */
    id = undefined;

    /**
     *
     * @param {number} id
     * @param {string} name
     */
    constructor(id, name) {
        this.id = id;
        this.name = name;
    }
}

new PlayerInputModule();