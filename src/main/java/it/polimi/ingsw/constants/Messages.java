package it.polimi.ingsw.constants;

public class Messages {
    public static final String ASK_USERNAME = "Insert username: ";
    public static final String GRACEFUL_TERM = "Application will now close...";
    public static final String SERVER_CRASHED = "Connection to server lost";

    // public static final String STUDENT_CHAR = "●";       // in Windows Terminal is '?' unless you run "chcp 65001" beforehand
    public static final String STUDENT_CHAR = "*";

    // public static final String PROF_CHAR = "▲";          // in Windows Terminal is '?' unless you run "chcp 65001" beforehand
    public static final String PROF_CHAR = "#";
    public static final String NO_ENTRY_CHAR = "X";


    // Possible status in messages
    public static final String STATUS_LOGIN = "LOGIN";
    public static final String STATUS_ACTION = "ACTION";
    public static final String STATUS_PONG = "PONG";
    public static final String STATUS_PING = "PING";
    public static final String STATUS_UPDATE = "UPDATE";
    public static final String STATUS_END = "END";

    // Generic errors
    public static final String INVALID_IDENTITY = "You are not who you are pretending to be";
    public static final String USAGE = "Usage: java -jar eriantys.jar [SERVER | CLI | GUI] [<PORT_NUMBER>] [<HOST_ADDRESS>]";
    public static final String JSON_NOT_FOUND = "File settings.json not found. Please check documentation";
    public static final String INVALID_SERVER_PORT = "Invalid server_port";
    public static final String PORT_NOT_AVAILABLE = "The selected port is not available at the moment";
    public static final String CANNOT_CONNECT_TO_SERVER = "Cannot connect to server, check server_address argument";
    public static final String APPLICATION_CLOSING = "Application will now close...";
    public static final String UNRECOGNISED_TYPE = "Unrecognised type";
    public static final String ERROR = "[ERROR] ";
    public static final String BAD_REQUEST = "Bad request";
    public static final String BAD_REQUEST_SYNTAX = "Bad request (syntax error)";

    // Errors while joining game
    public static final String INVALID_USERNAME = "Invalid username field";
    public static final String USERNAME_TOO_LONG = "Username is too long (max 32 characters)";
    public static final String USERNAME_ALREADY_TAKEN = "Username already taken";
    public static final String LOBBY_FULL = "The lobby is full";
    public static final String INVALID_NUM_PLAYERS = "Num players must be between 2 and 4";
    public static final String INVALID_PLAYER_CREATING_GAME = "You can't set this game's parameters";
    public static final String INVALID_FORMAT_NUM_PLAYER = "Num players must be a number";
    public static final String USERNAME_NOT_IN_LOADED_GAME = "Username doesn't match: login with the same username or create a new game";
    public static final String LOAD_GAME_FAILED = "Missing or corrupted save file, create a new game";

    // Connection errors
    public static final String ALERTING_OTHER_CLIENTS = "Connection to client lost, alerting other clients...";
    public static final String CONNECTION_WITH_CLIENT_LOST = "Connection with one client lost";

    // Messages in game creation
    public static final String ADDED_PLAYER = "Added player ";
    public static final String SET_GAME_PARAMETERS = "Added player ";
    public static final String NEW_PLAYER_JOINED = "A new player has joined";
    public static final String GAME_STARTING = "A new game is starting";
    public static final String GAME_CREATED = "A new game was created!";
    public static final String SERVER_READY = "Server ready, waiting for clients...";
    public static final String NEW_SOCKET = "New socket: ";

    // Errors in action phase
    public static final String GAME_NOT_STARTED = "Game is not started yet";
    public static final String NOT_YOUR_TURN = "It's not your turn";
    public static final String INVALID_ARGUMENT = "Invalid argument";
    public static final String ALREADY_PLAYED_ASSISTANT = "You have already played this assistant";
    public static final String ANOTHER_PLAYED_ASSISTANT = "Someone already played the same assistant this turn";
    public static final String NOT_LOGGED_IN = "You are not logged in!";
    public static final String INVALID_REQUEST = "Invalid request";
    public static final String INVALID_CLOUD = "The selected cloud is not valid";
    public static final String INVALID_MN_MOVE = "Invalid move for mother nature";
    public static final String MOVE_MN_FIRST = "Move mother nature first";
    public static final String MOVE_STUDENTS_FIRST = "Move your students first";
    public static final String ENTRANCE_DOESNT_CONTAIN_STUDENT = "The entrance doesn't contain this student";
    public static final String STUDENT_NOT_IN_ENTRANCE = "One or more students are not on the entrance";
    public static final String DINING_ROOM_DOESNT_CONTAIN_STUDENT = "The dining room doesn't contain this student";
    public static final String STUDENT_NOT_IN_DINING_ROOM = "One or more students are not on the dining room";
    public static final String NO_CHARACTER_IN_NON_EXPERT = "There are no characters in the non expert mode";
    public final static String INVALID_CHARACTER = "This is not a valid character";
    public static final String CHARACTER_NOT_IN_GAME = "This character is not in the game";
    public static final String INVALID_SWAP = "This is not a valid swap";
    public static final String MOVE_JUST_ONE = "You have to move only one student";
    public static final String STUDENT_NOT_FOUND = "Student not found. Check your choices";
    public static final String STUDENT_NOT_ON_CHARACTER = "The character doesn't contain this student";
    public static final String NO_NOENTRY = "There are no NoEntry pawns left on this card";
    public static final String NOT_PASSIVE = "This is not a passive character";
    public static final String MOVING_MORE_STUDENTS = "You are trying to move more students than you are allowed to";
    public static final String ALREADY_PLAYED_CHARACTER = "You already played a character this turn";
    public static final String EMPTY_BAG = "The bag is empty!";
    public static final String NOT_ENOUGH_COINS = "You don't have enough coins to play this character";
    public static final String INVALID_ISLAND = "Invalid island index";

    // Actions
    public static final String ACTION_SET_USERNAME = "SET_USERNAME";
    public static final String ACTION_CREATE_GAME = "CREATE_GAME";
    public static final String ACTION_LOAD_GAME = "LOAD_GAME";
    public static final String ACTION_PLAY_ASSISTANT = "PLAY_ASSISTANT";
    public static final String ACTION_MOVE_STUDENT = "MOVE_STUDENT";
    public static final String ACTION_MOVE_STUDENT_TO_DINING = "MOVE_STUDENT_TO_DINING";
    public static final String ACTION_MOVE_STUDENT_TO_ISLAND = "MOVE_STUDENT_TO_ISLAND";
    public static final String ACTION_MOVE_MN = "MOVE_MN";
    public static final String ACTION_PLAY_CHARACTER = "PLAY_CHARACTER";
    public static final String ACTION_FILL_FROM_CLOUD = "FILL_FROM_CLOUD";

    // Messages in planning phase
    public static final String PLANNING_PHASE_ENDED = "Planning phase is ended";

    // Messages in action phase
    public static final String LAST_ROUND = "Be aware! This is the last round";
    public static final String GAME_ENDED = "The game is ended";
    public static final String GAME_WON = "Congratulations, you won the game!";
    public static final String GAME_LOST = "Unfortunately you lost.";
    public static final String IS_PLAYING = " is playing...";

    // Server log messages
    public static final String SAVE_OK = "Game saved to file";
    public static final String SAVE_ERR = "Error while saving the game";
    public static final String LOAD_OK = "Game loaded from file";
    public static final String LOAD_ERR = "Error while loading the game";
    public static final String SAVING_TO_FILE = "Saving to file...";
    public static final String CLEARING_GAME = "Connection with one client lost, clearing the game...";

    // Errors for GUI
    public static final String GENERIC_ERROR_GUI = "Error while loading the scene";

    // Character messages
    public static final String CHOOSE_BOUND_CHARACTER = "Choose how many students do you want to swap";
    public static final String CHOOSE_COLOR_CHARACTER = "Choose one color for the effect of the character";

    // Messages in GUI
    public static final String END_GAME_TITLE = "Game is ended";
    public static final String END_GAME_BUTTON_TEXT = "Close application";
    public static final String GAME_ENDED_MESSAGE = "The game is ended. See you at the next match!";

    // Broadcast messages to notify that a player did a specific action
    public static final String BROADCAST_SEPARATOR = ". Now ";
    public static final String BROADCAST_ASSISTANT = " played assistant number ";
    public static final String BROADCAST_TO_DINING = " student to his dining room";
    public static final String BROADCAST_TO_ISLAND = " student to island number ";
    public static final String BROADCAST_FOR_MOTHER_NATURE = " moved mother nature of ";
    public static final String BROADCAST_FILL_FROM_CLOUD = " chose cloud number ";
    public static final String BROADCAST_GAME_WON = " won the game";

    // Alert messages in GUI
    public static final String CLOSE_GAME_TITLE = "Close game";
    public static final String CONFIRM_CLOSE_GAME = "Are you sure you want to close Eriantys?";
}
