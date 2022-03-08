import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.Transferable;
import java.awt.datatransfer.UnsupportedFlavorException;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
@ObfuscatedName("cv")
@Implements("UserComparator7")
public class UserComparator7 extends AbstractUserComparator {
    @ObfuscatedName("rt")
    @ObfuscatedSignature(descriptor = "Ley;")
    @Export("guestClanSettings")
    static ClanSettings guestClanSettings;

    @ObfuscatedName("hu")
    @ObfuscatedGetter(intValue = -1391181051)
    static int field1352;

    @ObfuscatedName("c")
    @Export("reversed")
    final boolean reversed;

    public UserComparator7(boolean var1) {
        this.reversed = var1;
    }

    @ObfuscatedName("c")
    @ObfuscatedSignature(descriptor = "(Lmd;Lmd;I)I", garbageValue = "2116759731")
    @Export("compareBuddy")
    int compareBuddy(Buddy var1, Buddy var2) {
        if ((var1.world != 0) && (var2.world != 0)) {
            return this.reversed ? var1.int2 - var2.int2 : var2.int2 - var1.int2;
        } else {
            return this.compareUser(var1, var2);
        }
    }

    public int compare(Object var1, Object var2) {
        return this.compareBuddy(((Buddy) (var1)), ((Buddy) (var2)));
    }

    @ObfuscatedName("s")
    @ObfuscatedSignature(descriptor = "(Ljava/lang/CharSequence;I)I", garbageValue = "269685470")
    public static int method2464(CharSequence var0) {
        return WorldMapIcon_0.method4690(var0, 10, true);
    }

    @ObfuscatedName("v")
    @ObfuscatedSignature(descriptor = "(Lal;Llv;B)V", garbageValue = "-66")
    static void method2465(GameEngine var0, Font var1) {
        int var3;
        int var4;
        int var5;
        if (Login.worldSelectOpen) {
            while (true) {
                if (!class370.isKeyDown()) {
                    if ((MouseHandler.MouseHandler_lastButton != 1) && (class370.mouseCam || (MouseHandler.MouseHandler_lastButton != 4))) {
                        break;
                    }
                    int var2 = Login.xPadding + 280;
                    if ((((MouseHandler.MouseHandler_lastPressedX >= var2) && (MouseHandler.MouseHandler_lastPressedX <= (var2 + 14))) && (MouseHandler.MouseHandler_lastPressedY >= 4)) && (MouseHandler.MouseHandler_lastPressedY <= 18)) {
                        Message.changeWorldSelectSorting(0, 0);
                        break;
                    }
                    if ((((MouseHandler.MouseHandler_lastPressedX >= (var2 + 15)) && (MouseHandler.MouseHandler_lastPressedX <= (var2 + 80))) && (MouseHandler.MouseHandler_lastPressedY >= 4)) && (MouseHandler.MouseHandler_lastPressedY <= 18)) {
                        Message.changeWorldSelectSorting(0, 1);
                        break;
                    }
                    var3 = Login.xPadding + 390;
                    if ((((MouseHandler.MouseHandler_lastPressedX >= var3) && (MouseHandler.MouseHandler_lastPressedX <= (var3 + 14))) && (MouseHandler.MouseHandler_lastPressedY >= 4)) && (MouseHandler.MouseHandler_lastPressedY <= 18)) {
                        Message.changeWorldSelectSorting(1, 0);
                        break;
                    }
                    if ((((MouseHandler.MouseHandler_lastPressedX >= (var3 + 15)) && (MouseHandler.MouseHandler_lastPressedX <= (var3 + 80))) && (MouseHandler.MouseHandler_lastPressedY >= 4)) && (MouseHandler.MouseHandler_lastPressedY <= 18)) {
                        Message.changeWorldSelectSorting(1, 1);
                        break;
                    }
                    var4 = Login.xPadding + 500;
                    if ((((MouseHandler.MouseHandler_lastPressedX >= var4) && (MouseHandler.MouseHandler_lastPressedX <= (var4 + 14))) && (MouseHandler.MouseHandler_lastPressedY >= 4)) && (MouseHandler.MouseHandler_lastPressedY <= 18)) {
                        Message.changeWorldSelectSorting(2, 0);
                        break;
                    }
                    if ((((MouseHandler.MouseHandler_lastPressedX >= (var4 + 15)) && (MouseHandler.MouseHandler_lastPressedX <= (var4 + 80))) && (MouseHandler.MouseHandler_lastPressedY >= 4)) && (MouseHandler.MouseHandler_lastPressedY <= 18)) {
                        Message.changeWorldSelectSorting(2, 1);
                        break;
                    }
                    var5 = Login.xPadding + 610;
                    if ((((MouseHandler.MouseHandler_lastPressedX >= var5) && (MouseHandler.MouseHandler_lastPressedX <= (var5 + 14))) && (MouseHandler.MouseHandler_lastPressedY >= 4)) && (MouseHandler.MouseHandler_lastPressedY <= 18)) {
                        Message.changeWorldSelectSorting(3, 0);
                        break;
                    }
                    if ((((MouseHandler.MouseHandler_lastPressedX >= (var5 + 15)) && (MouseHandler.MouseHandler_lastPressedX <= (var5 + 80))) && (MouseHandler.MouseHandler_lastPressedY >= 4)) && (MouseHandler.MouseHandler_lastPressedY <= 18)) {
                        Message.changeWorldSelectSorting(3, 1);
                        break;
                    }
                    if ((((MouseHandler.MouseHandler_lastPressedX >= (Login.xPadding + 708)) && (MouseHandler.MouseHandler_lastPressedY >= 4)) && (MouseHandler.MouseHandler_lastPressedX <= ((Login.xPadding + 708) + 50))) && (MouseHandler.MouseHandler_lastPressedY <= 20)) {
                        class120.method2699();
                        break;
                    }
                    if (Login.hoveredWorldIndex != (-1)) {
                        World var6 = class33.World_worlds[Login.hoveredWorldIndex];
                        InterfaceParent.changeWorld(var6);
                        class120.method2699();
                    } else {
                        if ((((((Login.worldSelectPage > 0) && (class186.worldSelectLeftSprite != null)) && (MouseHandler.MouseHandler_lastPressedX >= 0)) && (MouseHandler.MouseHandler_lastPressedX <= class186.worldSelectLeftSprite.subWidth)) && (MouseHandler.MouseHandler_lastPressedY >= ((NPC.canvasHeight / 2) - 50))) && (MouseHandler.MouseHandler_lastPressedY <= ((NPC.canvasHeight / 2) + 50))) {
                            --Login.worldSelectPage;
                        }
                        if ((((((Login.worldSelectPage < Login.worldSelectPagesCount) && (DirectByteArrayCopier.worldSelectRightSprite != null)) && (MouseHandler.MouseHandler_lastPressedX >= ((DirectByteArrayCopier.canvasWidth - DirectByteArrayCopier.worldSelectRightSprite.subWidth) - 5))) && (MouseHandler.MouseHandler_lastPressedX <= DirectByteArrayCopier.canvasWidth)) && (MouseHandler.MouseHandler_lastPressedY >= ((NPC.canvasHeight / 2) - 50))) && (MouseHandler.MouseHandler_lastPressedY <= ((NPC.canvasHeight / 2) + 50))) {
                            ++Login.worldSelectPage;
                        }
                    }
                    break;
                }
                if (class160.field1749 == 13) {
                    class120.method2699();
                    break;
                }
                if (class160.field1749 == 96) {
                    if ((Login.worldSelectPage > 0) && (class186.worldSelectLeftSprite != null)) {
                        --Login.worldSelectPage;
                    }
                } else if (((class160.field1749 == 97) && (Login.worldSelectPage < Login.worldSelectPagesCount)) && (DirectByteArrayCopier.worldSelectRightSprite != null)) {
                    ++Login.worldSelectPage;
                }
            } 
        } else {
            if ((((MouseHandler.MouseHandler_lastButton == 1) || ((!class370.mouseCam) && (MouseHandler.MouseHandler_lastButton == 4))) && (MouseHandler.MouseHandler_lastPressedX >= ((Login.xPadding + 765) - 50))) && (MouseHandler.MouseHandler_lastPressedY >= 453)) {
                class424.clientPreferences.titleMusicDisabled = !class424.clientPreferences.titleMusicDisabled;
                GameEngine.savePreferences();
                if (!class424.clientPreferences.titleMusicDisabled) {
                    Archive var22 = WorldMapLabelSize.archive6;
                    var3 = var22.getGroupId("scape main");
                    var4 = var22.getFileId(var3, "");
                    MenuAction.method1894(var22, var3, var4, 255, false);
                } else {
                    class265.midiPcmStream.clear();
                    class265.musicPlayerStatus = 1;
                    class265.musicTrackArchive = null;
                }
            }
            if (Client.gameState != 5) {
                if ((-1L) == Login.field922) {
                    Login.field922 = DirectByteArrayCopier.getServerTime() + 1000L;
                }
                long var23 = DirectByteArrayCopier.getServerTime();
                boolean var44;
                if ((Client.archiveLoaders != null) && (Client.archiveLoadersDone < Client.archiveLoaders.size())) {
                    while (true) {
                        if (Client.archiveLoadersDone >= Client.archiveLoaders.size()) {
                            var44 = true;
                            break;
                        }
                        ArchiveLoader var25 = ((ArchiveLoader) (Client.archiveLoaders.get(Client.archiveLoadersDone)));
                        if (!var25.isLoaded()) {
                            var44 = false;
                            break;
                        }
                        ++Client.archiveLoadersDone;
                    } 
                } else {
                    var44 = true;
                }
                if (var44 && ((-1L) == Login.field923)) {
                    Login.field923 = var23;
                    if (Login.field923 > Login.field922) {
                        Login.field922 = Login.field923;
                    }
                }
                if ((Client.gameState == 10) || (Client.gameState == 11)) {
                    if (Language.Language_EN == class122.clientLanguage) {
                        if ((MouseHandler.MouseHandler_lastButton == 1) || ((!class370.mouseCam) && (MouseHandler.MouseHandler_lastButton == 4))) {
                            var5 = Login.xPadding + 5;
                            short var26 = 463;
                            byte var7 = 100;
                            byte var8 = 35;
                            if ((((MouseHandler.MouseHandler_lastPressedX >= var5) && (MouseHandler.MouseHandler_lastPressedX <= (var7 + var5))) && (MouseHandler.MouseHandler_lastPressedY >= var26)) && (MouseHandler.MouseHandler_lastPressedY <= (var26 + var8))) {
                                class414.method7278();
                                return;
                            }
                        }
                        if (WorldMapID.World_request != null) {
                            class414.method7278();
                        }
                    }
                    var5 = MouseHandler.MouseHandler_lastButton;
                    int var59 = MouseHandler.MouseHandler_lastPressedX;
                    int var45 = MouseHandler.MouseHandler_lastPressedY;
                    if (var5 == 0) {
                        var59 = MouseHandler.MouseHandler_x;
                        var45 = MouseHandler.MouseHandler_y;
                    }
                    if ((!class370.mouseCam) && (var5 == 4)) {
                        var5 = 1;
                    }
                    int var48;
                    short var49;
                    if (Login.loginIndex == 0) {
                        boolean var55 = false;
                        while (class370.isKeyDown()) {
                            if (class160.field1749 == 84) {
                                var55 = true;
                            }
                        } 
                        var48 = class4.loginBoxCenter - 80;
                        var49 = 291;
                        if (((((var5 == 1) && (var59 >= (var48 - 75))) && (var59 <= (var48 + 75))) && (var45 >= (var49 - 20))) && (var45 <= (var49 + 20))) {
                            MilliClock.openURL(StructComposition.method3387("secure", true) + "m=account-creation/g=oldscape/create_account_funnel.ws", true, false);
                        }
                        var48 = class4.loginBoxCenter + 80;
                        if ((((((var5 == 1) && (var59 >= (var48 - 75))) && (var59 <= (var48 + 75))) && (var45 >= (var49 - 20))) && (var45 <= (var49 + 20))) || var55) {
                            if ((Client.worldProperties & 33554432) != 0) {
                                Login.Login_response0 = "";
                                Login.Login_response1 = "This is a <col=00ffff>Beta<col=ffffff> world.";
                                Login.Login_response2 = "Your normal account will not be affected.";
                                Login.Login_response3 = "";
                                Player.method2159(1);
                                WorldMapLabelSize.method4317();
                            } else if ((Client.worldProperties & 4) != 0) {
                                if ((Client.worldProperties & 1024) != 0) {
                                    Login.Login_response1 = "This is a <col=ffff00>High Risk <col=ff0000>PvP<col=ffffff> world.";
                                    Login.Login_response2 = "Players can attack each other almost everywhere";
                                    Login.Login_response3 = "and the Protect Item prayer won't work.";
                                } else {
                                    Login.Login_response1 = "This is a <col=ff0000>PvP<col=ffffff> world.";
                                    Login.Login_response2 = "Players can attack each other";
                                    Login.Login_response3 = "almost everywhere.";
                                }
                                Login.Login_response0 = "Warning!";
                                Player.method2159(1);
                                WorldMapLabelSize.method4317();
                            } else if ((Client.worldProperties & 1024) != 0) {
                                Login.Login_response1 = "This is a <col=ffff00>High Risk<col=ffffff> world.";
                                Login.Login_response2 = "The Protect Item prayer will";
                                Login.Login_response3 = "not work on this world.";
                                Login.Login_response0 = "Warning!";
                                Player.method2159(1);
                                WorldMapLabelSize.method4317();
                            } else {
                                Archive.Login_promptCredentials(false);
                            }
                        }
                    } else {
                        short var9;
                        int var46;
                        if (Login.loginIndex == 1) {
                            while (true) {
                                if (!class370.isKeyDown()) {
                                    var46 = class4.loginBoxCenter - 80;
                                    var9 = 321;
                                    if (((((var5 == 1) && (var59 >= (var46 - 75))) && (var59 <= (var46 + 75))) && (var45 >= (var9 - 20))) && (var45 <= (var9 + 20))) {
                                        Archive.Login_promptCredentials(false);
                                    }
                                    var46 = class4.loginBoxCenter + 80;
                                    if (((((var5 == 1) && (var59 >= (var46 - 75))) && (var59 <= (var46 + 75))) && (var45 >= (var9 - 20))) && (var45 <= (var9 + 20))) {
                                        Player.method2159(0);
                                    }
                                    break;
                                }
                                if (class160.field1749 == 84) {
                                    Archive.Login_promptCredentials(false);
                                } else if (class160.field1749 == 13) {
                                    Player.method2159(0);
                                }
                            } 
                        } else {
                            int var13;
                            int var20;
                            int var30;
                            short var47;
                            boolean var60;
                            if (Login.loginIndex == 2) {
                                var47 = 201;
                                var46 = var47 + 52;
                                if (((var5 == 1) && (var45 >= (var46 - 12))) && (var45 < (var46 + 2))) {
                                    Login.currentLoginField = 0;
                                }
                                var46 += 15;
                                if (((var5 == 1) && (var45 >= (var46 - 12))) && (var45 < (var46 + 2))) {
                                    Login.currentLoginField = 1;
                                }
                                var46 += 15;
                                var47 = 361;
                                if (class6.field25 != null) {
                                    var48 = class6.field25.highX / 2;
                                    if (((((var5 == 1) && (var59 >= (class6.field25.lowX - var48))) && (var59 <= (var48 + class6.field25.lowX))) && (var45 >= (var47 - 15))) && (var45 < var47)) {
                                        switch (Login.field918) {
                                            case 1 :
                                                setLoginResponseString("Please enter your username.", "If you created your account after November", "2010, this will be the creation email address.");
                                                Player.method2159(5);
                                                return;
                                            case 2 :
                                                MilliClock.openURL("https://support.runescape.com/hc/en-gb", true, false);
                                        }
                                    }
                                }
                                var48 = class4.loginBoxCenter - 80;
                                var49 = 321;
                                if (((((var5 == 1) && (var59 >= (var48 - 75))) && (var59 <= (var48 + 75))) && (var45 >= (var49 - 20))) && (var45 <= (var49 + 20))) {
                                    Login.Login_username = Login.Login_username.trim();
                                    if (Login.Login_username.length() == 0) {
                                        setLoginResponseString("", "Please enter your username/email address.", "");
                                        return;
                                    }
                                    if (Login.Login_password.length() == 0) {
                                        setLoginResponseString("", "Please enter your password.", "");
                                        return;
                                    }
                                    setLoginResponseString("", "Connecting to server...", "");
                                    Friend.method6297(false);
                                    class111.updateGameState(20);
                                    return;
                                }
                                var48 = (Login.loginBoxX + 180) + 80;
                                if (((((var5 == 1) && (var59 >= (var48 - 75))) && (var59 <= (var48 + 75))) && (var45 >= (var49 - 20))) && (var45 <= (var49 + 20))) {
                                    Player.method2159(0);
                                    Login.Login_username = "";
                                    Login.Login_password = "";
                                    GameObject.field2588 = 0;
                                    class145.otp = "";
                                    Login.field893 = true;
                                }
                                var48 = class4.loginBoxCenter + (-117);
                                var49 = 277;
                                Login.field912 = (((var59 >= var48) && (var59 < (var48 + FriendSystem.field812))) && (var45 >= var49)) && (var45 < (var49 + class133.field1560));
                                if ((var5 == 1) && Login.field912) {
                                    Client.Login_isUsernameRemembered = !Client.Login_isUsernameRemembered;
                                    if ((!Client.Login_isUsernameRemembered) && (class424.clientPreferences.rememberedUsername != null)) {
                                        class424.clientPreferences.rememberedUsername = null;
                                        GameEngine.savePreferences();
                                    }
                                }
                                var48 = class4.loginBoxCenter + 24;
                                var49 = 277;
                                Login.field913 = (((var59 >= var48) && (var59 < (var48 + FriendSystem.field812))) && (var45 >= var49)) && (var45 < (var49 + class133.field1560));
                                if ((var5 == 1) && Login.field913) {
                                    class424.clientPreferences.hideUsername = !class424.clientPreferences.hideUsername;
                                    if (!class424.clientPreferences.hideUsername) {
                                        Login.Login_username = "";
                                        class424.clientPreferences.rememberedUsername = null;
                                        WorldMapLabelSize.method4317();
                                    }
                                    GameEngine.savePreferences();
                                }
                                while (true) {
                                    Transferable var51;
                                    do {
                                        while (true) {
                                            label1483 : do {
                                                while (true) {
                                                    while (class370.isKeyDown()) {
                                                        if (class160.field1749 != 13) {
                                                            if (Login.currentLoginField != 0) {
                                                                continue label1483;
                                                            }
                                                            Players.method2308(ClanSettings.field1610);
                                                            if ((class160.field1749 == 85) && (Login.Login_username.length() > 0)) {
                                                                Login.Login_username = Login.Login_username.substring(0, Login.Login_username.length() - 1);
                                                            }
                                                            if ((class160.field1749 == 84) || (class160.field1749 == 80)) {
                                                                Login.currentLoginField = 1;
                                                            }
                                                            if (class20.method288(ClanSettings.field1610) && (Login.Login_username.length() < 320)) {
                                                                Login.Login_username = Login.Login_username + ClanSettings.field1610;
                                                            }
                                                        } else {
                                                            Player.method2159(0);
                                                            Login.Login_username = "";
                                                            Login.Login_password = "";
                                                            GameObject.field2588 = 0;
                                                            class145.otp = "";
                                                            Login.field893 = true;
                                                        }
                                                    } 
                                                    return;
                                                } 
                                            } while (Login.currentLoginField != 1 );
                                            if ((class160.field1749 == 85) && (Login.Login_password.length() > 0)) {
                                                Login.Login_password = Login.Login_password.substring(0, Login.Login_password.length() - 1);
                                            } else if ((class160.field1749 == 84) || (class160.field1749 == 80)) {
                                                Login.currentLoginField = 0;
                                                if (class160.field1749 == 84) {
                                                    Login.Login_username = Login.Login_username.trim();
                                                    if (Login.Login_username.length() == 0) {
                                                        setLoginResponseString("", "Please enter your username/email address.", "");
                                                        return;
                                                    }
                                                    if (Login.Login_password.length() == 0) {
                                                        setLoginResponseString("", "Please enter your password.", "");
                                                        return;
                                                    }
                                                    setLoginResponseString("", "Connecting to server...", "");
                                                    Friend.method6297(false);
                                                    class111.updateGameState(20);
                                                    return;
                                                }
                                            }
                                            if ((KeyHandler.KeyHandler_pressedKeys[82] || KeyHandler.KeyHandler_pressedKeys[87]) && (class160.field1749 == 67)) {
                                                Clipboard var50 = Toolkit.getDefaultToolkit().getSystemClipboard();
                                                var51 = var50.getContents(class414.client);
                                                var13 = 20 - Login.Login_password.length();
                                                break;
                                            }
                                            char var61 = ClanSettings.field1610;
                                            if ((((var61 < ' ') || (var61 >= 127)) && ((var61 <= 127) || (var61 >= 160))) && ((var61 <= 160) || (var61 > 255))) {
                                                label1711 : {
                                                    if (var61 != 0) {
                                                        char[] var62 = class333.cp1252AsciiExtension;
                                                        for (var30 = 0; var30 < var62.length; ++var30) {
                                                            char var15 = var62[var30];
                                                            if (var61 == var15) {
                                                                var60 = true;
                                                                break label1711;
                                                            }
                                                        }
                                                    }
                                                    var60 = false;
                                                }
                                            } else {
                                                var60 = true;
                                            }
                                            if ((var60 && class20.method288(ClanSettings.field1610)) && (Login.Login_password.length() < 20)) {
                                                Login.Login_password = Login.Login_password + ClanSettings.field1610;
                                            }
                                        } 
                                    } while (var13 <= 0 );
                                    try {
                                        String var14 = ((String) (var51.getTransferData(DataFlavor.stringFlavor)));
                                        int var53 = Math.min(var13, var14.length());
                                        for (int var54 = 0; var54 < var53; ++var54) {
                                            char var56 = var14.charAt(var54);
                                            boolean var17;
                                            if ((((var56 < ' ') || (var56 >= 127)) && ((var56 <= 127) || (var56 >= 160))) && ((var56 <= 160) || (var56 > 255))) {
                                                label1714 : {
                                                    if (var56 != 0) {
                                                        char[] var58 = class333.cp1252AsciiExtension;
                                                        for (var20 = 0; var20 < var58.length; ++var20) {
                                                            char var21 = var58[var20];
                                                            if (var56 == var21) {
                                                                var17 = true;
                                                                break label1714;
                                                            }
                                                        }
                                                    }
                                                    var17 = false;
                                                }
                                            } else {
                                                var17 = true;
                                            }
                                            if ((!var17) || (!class20.method288(var14.charAt(var54)))) {
                                                Player.method2159(3);
                                                return;
                                            }
                                        }
                                        Login.Login_password = Login.Login_password + var14.substring(0, var53);
                                    } catch (UnsupportedFlavorException var42) {
                                    } catch (IOException var43) {
                                    }
                                } 
                            } else if (Login.loginIndex == 3) {
                                var46 = Login.loginBoxX + 180;
                                var9 = 276;
                                if (((((var5 == 1) && (var59 >= (var46 - 75))) && (var59 <= (var46 + 75))) && (var45 >= (var9 - 20))) && (var45 <= (var9 + 20))) {
                                    Tiles.method2027(false);
                                }
                                var46 = Login.loginBoxX + 180;
                                var9 = 326;
                                if (((((var5 == 1) && (var59 >= (var46 - 75))) && (var59 <= (var46 + 75))) && (var45 >= (var9 - 20))) && (var45 <= (var9 + 20))) {
                                    setLoginResponseString("Please enter your username.", "If you created your account after November", "2010, this will be the creation email address.");
                                    Player.method2159(5);
                                    return;
                                }
                            } else {
                                int var28;
                                if (Login.loginIndex == 4) {
                                    var46 = (Login.loginBoxX + 180) - 80;
                                    var9 = 321;
                                    if (((((var5 == 1) && (var59 >= (var46 - 75))) && (var59 <= (var46 + 75))) && (var45 >= (var9 - 20))) && (var45 <= (var9 + 20))) {
                                        class145.otp.trim();
                                        if (class145.otp.length() != 6) {
                                            setLoginResponseString("", "Please enter a 6-digit PIN.", "");
                                            return;
                                        }
                                        GameObject.field2588 = Integer.parseInt(class145.otp);
                                        class145.otp = "";
                                        Friend.method6297(true);
                                        setLoginResponseString("", "Connecting to server...", "");
                                        class111.updateGameState(20);
                                        return;
                                    }
                                    if (((((var5 == 1) && (var59 >= ((Login.loginBoxX + 180) - 9))) && (var59 <= ((Login.loginBoxX + 180) + 130))) && (var45 >= 263)) && (var45 <= 296)) {
                                        Login.field893 = !Login.field893;
                                    }
                                    if (((((var5 == 1) && (var59 >= ((Login.loginBoxX + 180) - 34))) && (var59 <= ((Login.loginBoxX + 34) + 180))) && (var45 >= 351)) && (var45 <= 363)) {
                                        MilliClock.openURL(StructComposition.method3387("secure", true) + "m=totp-authenticator/disableTOTPRequest", true, false);
                                    }
                                    var46 = (Login.loginBoxX + 180) + 80;
                                    if (((((var5 == 1) && (var59 >= (var46 - 75))) && (var59 <= (var46 + 75))) && (var45 >= (var9 - 20))) && (var45 <= (var9 + 20))) {
                                        Player.method2159(0);
                                        Login.Login_username = "";
                                        Login.Login_password = "";
                                        GameObject.field2588 = 0;
                                        class145.otp = "";
                                    }
                                    while (class370.isKeyDown()) {
                                        boolean var10 = false;
                                        for (var28 = 0; var28 < "1234567890".length(); ++var28) {
                                            if (ClanSettings.field1610 == "1234567890".charAt(var28)) {
                                                var10 = true;
                                                break;
                                            }
                                        }
                                        if (class160.field1749 == 13) {
                                            Player.method2159(0);
                                            Login.Login_username = "";
                                            Login.Login_password = "";
                                            GameObject.field2588 = 0;
                                            class145.otp = "";
                                        } else {
                                            if ((class160.field1749 == 85) && (class145.otp.length() > 0)) {
                                                class145.otp = class145.otp.substring(0, class145.otp.length() - 1);
                                            }
                                            if (class160.field1749 == 84) {
                                                class145.otp.trim();
                                                if (class145.otp.length() != 6) {
                                                    setLoginResponseString("", "Please enter a 6-digit PIN.", "");
                                                    return;
                                                }
                                                GameObject.field2588 = Integer.parseInt(class145.otp);
                                                class145.otp = "";
                                                Friend.method6297(true);
                                                setLoginResponseString("", "Connecting to server...", "");
                                                class111.updateGameState(20);
                                                return;
                                            }
                                            if (var10 && (class145.otp.length() < 6)) {
                                                class145.otp = class145.otp + ClanSettings.field1610;
                                            }
                                        }
                                    } 
                                } else {
                                    int var27;
                                    if (Login.loginIndex == 5) {
                                        var46 = (Login.loginBoxX + 180) - 80;
                                        var9 = 321;
                                        if (((((var5 == 1) && (var59 >= (var46 - 75))) && (var59 <= (var46 + 75))) && (var45 >= (var9 - 20))) && (var45 <= (var9 + 20))) {
                                            class125.method2745();
                                            return;
                                        }
                                        var46 = (Login.loginBoxX + 180) + 80;
                                        if (((((var5 == 1) && (var59 >= (var46 - 75))) && (var59 <= (var46 + 75))) && (var45 >= (var9 - 20))) && (var45 <= (var9 + 20))) {
                                            Archive.Login_promptCredentials(true);
                                        }
                                        var49 = 361;
                                        if (PendingSpawn.field1107 != null) {
                                            var28 = PendingSpawn.field1107.highX / 2;
                                            if (((((var5 == 1) && (var59 >= (PendingSpawn.field1107.lowX - var28))) && (var59 <= (var28 + PendingSpawn.field1107.lowX))) && (var45 >= (var49 - 15))) && (var45 < var49)) {
                                                MilliClock.openURL(StructComposition.method3387("secure", true) + "m=weblogin/g=oldscape/cant_log_in", true, false);
                                            }
                                        }
                                        while (class370.isKeyDown()) {
                                            var60 = false;
                                            for (var27 = 0; var27 < "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"ï¿½$%^&*()-_=+[{]};:\'@#~,<.>/?\\| ".length(); ++var27) {
                                                if (ClanSettings.field1610 == "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"ï¿½$%^&*()-_=+[{]};:\'@#~,<.>/?\\| ".charAt(var27)) {
                                                    var60 = true;
                                                    break;
                                                }
                                            }
                                            if (class160.field1749 == 13) {
                                                Archive.Login_promptCredentials(true);
                                            } else {
                                                if ((class160.field1749 == 85) && (Login.Login_username.length() > 0)) {
                                                    Login.Login_username = Login.Login_username.substring(0, Login.Login_username.length() - 1);
                                                }
                                                if (class160.field1749 == 84) {
                                                    class125.method2745();
                                                    return;
                                                }
                                                if (var60 && (Login.Login_username.length() < 320)) {
                                                    Login.Login_username = Login.Login_username + ClanSettings.field1610;
                                                }
                                            }
                                        } 
                                    } else if (Login.loginIndex != 6) {
                                        if (Login.loginIndex == 7) {
                                            if (class261.field3085 && (!Client.onMobile)) {
                                                var46 = class4.loginBoxCenter - 150;
                                                var48 = ((var46 + 40) + 240) + 25;
                                                var49 = 231;
                                                var28 = var49 + 40;
                                                if (((((var5 == 1) && (var59 >= var46)) && (var59 <= var48)) && (var45 >= var49)) && (var45 <= var28)) {
                                                    var13 = var46;
                                                    var30 = 0;
                                                    while (true) {
                                                        if (var30 >= 8) {
                                                            var27 = 0;
                                                            break;
                                                        }
                                                        if (var59 <= (var13 + 30)) {
                                                            var27 = var30;
                                                            break;
                                                        }
                                                        var13 += 30;
                                                        var13 += ((var30 != 1) && (var30 != 3)) ? 5 : 20;
                                                        ++var30;
                                                    } 
                                                    Login.field910 = var27;
                                                }
                                                var27 = (Login.loginBoxX + 180) - 80;
                                                short var52 = 321;
                                                boolean var16;
                                                boolean var18;
                                                String[] var19;
                                                SimpleDateFormat var31;
                                                StringBuilder var32;
                                                String var33;
                                                Date var34;
                                                Date var35;
                                                java.util.Calendar var36;
                                                Date var57;
                                                boolean var63;
                                                java.util.Calendar var64;
                                                Date var65;
                                                if (((((var5 == 1) && (var59 >= (var27 - 75))) && (var59 <= (var27 + 75))) && (var45 >= (var52 - 20))) && (var45 <= (var52 + 20))) {
                                                    label1362 : {
                                                        try {
                                                            var31 = new SimpleDateFormat("ddMMyyyyHH", Locale.ENGLISH);
                                                            var31.setLenient(false);
                                                            var32 = new StringBuilder();
                                                            var19 = Login.field911;
                                                            var20 = 0;
                                                            while (true) {
                                                                if (var20 >= var19.length) {
                                                                    var32.append("12");
                                                                    var34 = var31.parse(var32.toString());
                                                                    break;
                                                                }
                                                                var33 = var19[var20];
                                                                if (var33 == null) {
                                                                    DefaultsGroup.method6590("Date not valid.", "Please ensure all characters are populated.", "");
                                                                    var34 = null;
                                                                    break;
                                                                }
                                                                var32.append(var33);
                                                                ++var20;
                                                            } 
                                                            var35 = var34;
                                                        } catch (ParseException var41) {
                                                            DefaultsGroup.method6590("Date not valid.", "Please ensure date follows the format", "DD/MM/YYYY and is after 01/01/1900");
                                                            var63 = false;
                                                            break label1362;
                                                        }
                                                        if (var35 == null) {
                                                            var63 = false;
                                                        } else {
                                                            var64 = java.util.Calendar.getInstance();
                                                            var64.set(1, var64.get(1) - 13);
                                                            var65 = var64.getTime();
                                                            var16 = var35.before(var65);
                                                            var36 = java.util.Calendar.getInstance();
                                                            var36.set(2, 0);
                                                            var36.set(5, 1);
                                                            var36.set(1, 1900);
                                                            var57 = var36.getTime();
                                                            var18 = var35.after(var57);
                                                            if (!var18) {
                                                                DefaultsGroup.method6590("Date not valid.", "Please ensure date follows the format", "DD/MM/YYYY and is after 01/01/1900");
                                                                var63 = false;
                                                            } else {
                                                                if (!var16) {
                                                                    Occluder.field2399 = 8388607;
                                                                } else {
                                                                    Occluder.field2399 = ((int) ((var35.getTime() / 86400000L) - 11745L));
                                                                }
                                                                var63 = true;
                                                            }
                                                        }
                                                    }
                                                    if (var63) {
                                                        class111.updateGameState(50);
                                                        return;
                                                    }
                                                }
                                                var27 = (Login.loginBoxX + 180) + 80;
                                                if (((((var5 == 1) && (var59 >= (var27 - 75))) && (var59 <= (var27 + 75))) && (var45 >= (var52 - 20))) && (var45 <= (var52 + 20))) {
                                                    Login.field911 = new String[8];
                                                    Archive.Login_promptCredentials(true);
                                                }
                                                while (class370.isKeyDown()) {
                                                    if (class160.field1749 == 101) {
                                                        Login.field911[Login.field910] = null;
                                                    }
                                                    if (class160.field1749 == 85) {
                                                        if ((Login.field911[Login.field910] == null) && (Login.field910 > 0)) {
                                                            --Login.field910;
                                                        }
                                                        Login.field911[Login.field910] = null;
                                                    }
                                                    if ((ClanSettings.field1610 >= '0') && (ClanSettings.field1610 <= '9')) {
                                                        Login.field911[Login.field910] = "" + ClanSettings.field1610;
                                                        if (Login.field910 < 7) {
                                                            ++Login.field910;
                                                        }
                                                    }
                                                    if (class160.field1749 == 84) {
                                                        label1290 : {
                                                            try {
                                                                var31 = new SimpleDateFormat("ddMMyyyyHH", Locale.ENGLISH);
                                                                var31.setLenient(false);
                                                                var32 = new StringBuilder();
                                                                var19 = Login.field911;
                                                                var20 = 0;
                                                                while (true) {
                                                                    if (var20 < var19.length) {
                                                                        var33 = var19[var20];
                                                                        if (var33 != null) {
                                                                            var32.append(var33);
                                                                            ++var20;
                                                                            continue;
                                                                        }
                                                                        DefaultsGroup.method6590("Date not valid.", "Please ensure all characters are populated.", "");
                                                                        var34 = null;
                                                                    } else {
                                                                        var32.append("12");
                                                                        var34 = var31.parse(var32.toString());
                                                                    }
                                                                    var35 = var34;
                                                                    break;
                                                                } 
                                                            } catch (ParseException var40) {
                                                                DefaultsGroup.method6590("Date not valid.", "Please ensure date follows the format", "DD/MM/YYYY and is after 01/01/1900");
                                                                var63 = false;
                                                                break label1290;
                                                            }
                                                            if (var35 == null) {
                                                                var63 = false;
                                                            } else {
                                                                var64 = java.util.Calendar.getInstance();
                                                                var64.set(1, var64.get(1) - 13);
                                                                var65 = var64.getTime();
                                                                var16 = var35.before(var65);
                                                                var36 = java.util.Calendar.getInstance();
                                                                var36.set(2, 0);
                                                                var36.set(5, 1);
                                                                var36.set(1, 1900);
                                                                var57 = var36.getTime();
                                                                var18 = var35.after(var57);
                                                                if (!var18) {
                                                                    DefaultsGroup.method6590("Date not valid.", "Please ensure date follows the format", "DD/MM/YYYY and is after 01/01/1900");
                                                                    var63 = false;
                                                                } else {
                                                                    if (!var16) {
                                                                        Occluder.field2399 = 8388607;
                                                                    } else {
                                                                        Occluder.field2399 = ((int) ((var35.getTime() / 86400000L) - 11745L));
                                                                    }
                                                                    var63 = true;
                                                                }
                                                            }
                                                        }
                                                        if (var63) {
                                                            class111.updateGameState(50);
                                                        }
                                                        return;
                                                    }
                                                } 
                                            } else {
                                                var46 = (Login.loginBoxX + 180) - 80;
                                                var9 = 321;
                                                if (((((var5 == 1) && (var59 >= (var46 - 75))) && (var59 <= (var46 + 75))) && (var45 >= (var9 - 20))) && (var45 <= (var9 + 20))) {
                                                    MilliClock.openURL(StructComposition.method3387("secure", true) + "m=dob/set_dob.ws", true, false);
                                                    setLoginResponseString("", "Page has opened in a new window.", "(Please check your popup blocker.)");
                                                    Player.method2159(6);
                                                    return;
                                                }
                                                var46 = (Login.loginBoxX + 180) + 80;
                                                if (((((var5 == 1) && (var59 >= (var46 - 75))) && (var59 <= (var46 + 75))) && (var45 >= (var9 - 20))) && (var45 <= (var9 + 20))) {
                                                    Archive.Login_promptCredentials(true);
                                                }
                                            }
                                        } else if (Login.loginIndex == 8) {
                                            var46 = (Login.loginBoxX + 180) - 80;
                                            var9 = 321;
                                            if (((((var5 == 1) && (var59 >= (var46 - 75))) && (var59 <= (var46 + 75))) && (var45 >= (var9 - 20))) && (var45 <= (var9 + 20))) {
                                                MilliClock.openURL("https://www.jagex.com/terms/privacy", true, false);
                                                setLoginResponseString("", "Page has opened in a new window.", "(Please check your popup blocker.)");
                                                Player.method2159(6);
                                                return;
                                            }
                                            var46 = (Login.loginBoxX + 180) + 80;
                                            if (((((var5 == 1) && (var59 >= (var46 - 75))) && (var59 <= (var46 + 75))) && (var45 >= (var9 - 20))) && (var45 <= (var9 + 20))) {
                                                Archive.Login_promptCredentials(true);
                                            }
                                        } else if (Login.loginIndex == 9) {
                                            var46 = Login.loginBoxX + 180;
                                            var9 = 311;
                                            if (((class160.field1749 == 84) || (class160.field1749 == 13)) || (((((var5 == 1) && (var59 >= (var46 - 75))) && (var59 <= (var46 + 75))) && (var45 >= (var9 - 20))) && (var45 <= (var9 + 20)))) {
                                                Tiles.method2027(false);
                                            }
                                        } else if (Login.loginIndex == 10) {
                                            var46 = Login.loginBoxX + 180;
                                            var9 = 209;
                                            if ((class160.field1749 == 84) || (((((var5 == 1) && (var59 >= (var46 - 109))) && (var59 <= (var46 + 109))) && (var45 >= var9)) && (var45 <= (var9 + 68)))) {
                                                setLoginResponseString("", "Connecting to server...", "");
                                                Client.field534 = class424.field4561;
                                                Friend.method6297(false);
                                                class111.updateGameState(20);
                                            }
                                        } else if (Login.loginIndex == 12) {
                                            var46 = class4.loginBoxCenter;
                                            var9 = 233;
                                            Bounds var38 = var1.method6013(0, 30, "<col=ffd200>terms of use</col>, <col=ffd200>privacy policy</col>, and <col=ffd200>end user licence</col>", var46, var9);
                                            Bounds var11 = var1.method6013(32, 32, "<col=ffd200>terms of use</col>, <col=ffd200>privacy policy</col>, and <col=ffd200>end user licence</col>", var46, var9);
                                            Bounds var12 = var1.method6013(70, 34, "<col=ffd200>terms of use</col>, <col=ffd200>privacy policy</col>, and <col=ffd200>end user licence</col>", var46, var9);
                                            var48 = var9 + 17;
                                            Bounds var29 = var1.method6013(0, 34, "<col=ffd200>agreement (EULA)</col>.", var46, var48);
                                            if (var5 == 1) {
                                                if (var38.method6599(var59, var45)) {
                                                    MilliClock.openURL("https://www.jagex.com/terms", true, false);
                                                } else if (var11.method6599(var59, var45)) {
                                                    MilliClock.openURL("https://www.jagex.com/terms/privacy", true, false);
                                                } else if (var12.method6599(var59, var45) || var29.method6599(var59, var45)) {
                                                    MilliClock.openURL("https://www.jagex.com/en-GB/legal/eula-runescape-oldschool", true, false);
                                                }
                                            }
                                            var46 = class4.loginBoxCenter - 80;
                                            var9 = 311;
                                            if (((((var5 == 1) && (var59 >= (var46 - 75))) && (var59 <= (var46 + 75))) && (var45 >= (var9 - 20))) && (var45 <= (var9 + 20))) {
                                                MenuAction.method1895();
                                                Tiles.method2027(true);
                                            }
                                            var46 = class4.loginBoxCenter + 80;
                                            if (((((var5 == 1) && (var59 >= (var46 - 75))) && (var59 <= (var46 + 75))) && (var45 >= (var9 - 20))) && (var45 <= (var9 + 20))) {
                                                Login.loginIndex = 13;
                                            }
                                        } else if (Login.loginIndex == 13) {
                                            var46 = class4.loginBoxCenter;
                                            var9 = 321;
                                            if (((((var5 == 1) && (var59 >= (var46 - 75))) && (var59 <= (var46 + 75))) && (var45 >= (var9 - 20))) && (var45 <= (var9 + 20))) {
                                                Tiles.method2027(true);
                                            }
                                        } else if (Login.loginIndex == 14) {
                                            String var39 = "";
                                            switch (Login.Login_banType) {
                                                case 0 :
                                                    var39 = "https://support.runescape.com/hc/en-gb/articles/115002238729-Account-Bans";
                                                    break;
                                                case 1 :
                                                    var39 = "https://support.runescape.com/hc/en-gb/articles/206103939-My-account-is-locked";
                                                    break;
                                                default :
                                                    Archive.Login_promptCredentials(false);
                                            }
                                            var48 = Login.loginBoxX + 180;
                                            var49 = 276;
                                            if (((((var5 == 1) && (var59 >= (var48 - 75))) && (var59 <= (var48 + 75))) && (var45 >= (var49 - 20))) && (var45 <= (var49 + 20))) {
                                                MilliClock.openURL(var39, true, false);
                                                setLoginResponseString("", "Page has opened in a new window.", "(Please check your popup blocker.)");
                                                Player.method2159(6);
                                                return;
                                            }
                                            var48 = Login.loginBoxX + 180;
                                            var49 = 326;
                                            if (((((var5 == 1) && (var59 >= (var48 - 75))) && (var59 <= (var48 + 75))) && (var45 >= (var49 - 20))) && (var45 <= (var49 + 20))) {
                                                Archive.Login_promptCredentials(false);
                                            }
                                        } else if (Login.loginIndex == 24) {
                                            var46 = Login.loginBoxX + 180;
                                            var9 = 301;
                                            if (((((var5 == 1) && (var59 >= (var46 - 75))) && (var59 <= (var46 + 75))) && (var45 >= (var9 - 20))) && (var45 <= (var9 + 20))) {
                                                Tiles.method2027(false);
                                            }
                                        }
                                    } else {
                                        while (true) {
                                            do {
                                                if (!class370.isKeyDown()) {
                                                    var47 = 321;
                                                    if (((var5 == 1) && (var45 >= (var47 - 20))) && (var45 <= (var47 + 20))) {
                                                        Archive.Login_promptCredentials(true);
                                                    }
                                                    return;
                                                }
                                            } while ((class160.field1749 != 84) && (class160.field1749 != 13) );
                                            Archive.Login_promptCredentials(true);
                                        } 
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("n")
    @ObfuscatedSignature(descriptor = "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;B)V", garbageValue = "54")
    @Export("setLoginResponseString")
    static void setLoginResponseString(String var0, String var1, String var2) {
        Login.Login_response1 = var0;
        Login.Login_response2 = var1;
        Login.Login_response3 = var2;
    }

    @ObfuscatedName("hn")
    @ObfuscatedSignature(descriptor = "(Lij;I)V", garbageValue = "366984156")
    static final void method2463(class255 var0) {
        PacketBuffer var1 = Client.packetWriter.packetBuffer;
        int var2;
        int var4;
        int var5;
        int var6;
        int var7;
        int var8;
        int var9;
        int var11;
        int var38;
        if (class255.field2946 == var0) {
            var2 = var1.readUnsignedShortAdd();
            var38 = var1.readUnsignedByte();
            var4 = ((var38 >> 4) & 7) + class33.field243;
            var5 = (var38 & 7) + Canvas.field157;
            var6 = var1.readUnsignedByte();
            var7 = var6 >> 2;
            var8 = var6 & 3;
            var9 = Client.field565[var7];
            if ((((var4 >= 0) && (var5 >= 0)) && (var4 < 103)) && (var5 < 103)) {
                if (var9 == 0) {
                    BoundaryObject var36 = Decimator.scene.method4002(SoundSystem.Client_plane, var4, var5);
                    if (var36 != null) {
                        var11 = Skeleton.Entity_unpackID(var36.tag);
                        if (var7 == 2) {
                            var36.renderable1 = new DynamicObject(var11, 2, var8 + 4, SoundSystem.Client_plane, var4, var5, var2, false, var36.renderable1);
                            var36.renderable2 = new DynamicObject(var11, 2, (var8 + 1) & 3, SoundSystem.Client_plane, var4, var5, var2, false, var36.renderable2);
                        } else {
                            var36.renderable1 = new DynamicObject(var11, var7, var8, SoundSystem.Client_plane, var4, var5, var2, false, var36.renderable1);
                        }
                    }
                }
                if (var9 == 1) {
                    WallDecoration var42 = Decimator.scene.method3919(SoundSystem.Client_plane, var4, var5);
                    if (var42 != null) {
                        var11 = Skeleton.Entity_unpackID(var42.tag);
                        if ((var7 != 4) && (var7 != 5)) {
                            if (var7 == 6) {
                                var42.renderable1 = new DynamicObject(var11, 4, var8 + 4, SoundSystem.Client_plane, var4, var5, var2, false, var42.renderable1);
                            } else if (var7 == 7) {
                                var42.renderable1 = new DynamicObject(var11, 4, ((var8 + 2) & 3) + 4, SoundSystem.Client_plane, var4, var5, var2, false, var42.renderable1);
                            } else if (var7 == 8) {
                                var42.renderable1 = new DynamicObject(var11, 4, var8 + 4, SoundSystem.Client_plane, var4, var5, var2, false, var42.renderable1);
                                var42.renderable2 = new DynamicObject(var11, 4, ((var8 + 2) & 3) + 4, SoundSystem.Client_plane, var4, var5, var2, false, var42.renderable2);
                            }
                        } else {
                            var42.renderable1 = new DynamicObject(var11, 4, var8, SoundSystem.Client_plane, var4, var5, var2, false, var42.renderable1);
                        }
                    }
                }
                if (var9 == 2) {
                    GameObject var43 = Decimator.scene.getGameObject(SoundSystem.Client_plane, var4, var5);
                    if (var7 == 11) {
                        var7 = 10;
                    }
                    if (var43 != null) {
                        var43.renderable = new DynamicObject(Skeleton.Entity_unpackID(var43.tag), var7, var8, SoundSystem.Client_plane, var4, var5, var2, false, var43.renderable);
                    }
                }
                if (var9 == 3) {
                    FloorDecoration var44 = Decimator.scene.getFloorDecoration(SoundSystem.Client_plane, var4, var5);
                    if (var44 != null) {
                        var44.renderable = new DynamicObject(Skeleton.Entity_unpackID(var44.tag), 22, var8, SoundSystem.Client_plane, var4, var5, var2, false, var44.renderable);
                    }
                }
            }
        } else if (class255.field2942 == var0) {
            var2 = var1.readUnsignedByte();
            var38 = ((var2 >> 4) & 7) + class33.field243;
            var4 = (var2 & 7) + Canvas.field157;
            var5 = var1.readUnsignedShortAdd();
            var6 = var1.readUnsignedShortAddLE();
            var7 = var1.readUnsignedShort();
            if ((((var38 >= 0) && (var4 >= 0)) && (var38 < 104)) && (var4 < 104)) {
                NodeDeque var41 = Client.groundItems[SoundSystem.Client_plane][var38][var4];
                if (var41 != null) {
                    for (TileItem var35 = ((TileItem) (var41.last())); var35 != null; var35 = ((TileItem) (var41.previous()))) {
                        if (((var6 & 32767) == var35.id) && (var5 == var35.quantity)) {
                            var35.quantity = var7;
                            break;
                        }
                    }
                    StudioGame.updateItemPile(var38, var4);
                }
            }
        } else {
            byte var3;
            int var10;
            int var12;
            if (class255.field2947 == var0) {
                var2 = var1.readUnsignedShortAdd();
                var3 = var1.readByteAdd();
                var4 = var1.readUnsignedShortLE();
                var5 = var1.readUnsignedShort();
                var6 = var1.readUnsignedByteNeg();
                var7 = ((var6 >> 4) & 7) + class33.field243;
                var8 = (var6 & 7) + Canvas.field157;
                var9 = var1.readUnsignedByteNeg();
                var10 = var9 >> 2;
                var11 = var9 & 3;
                var12 = Client.field565[var10];
                byte var13 = var1.readByteAdd();
                byte var14 = var1.readByteAdd();
                byte var15 = var1.readByte();
                int var16 = var1.readUnsignedShort();
                Player var17;
                if (var2 == Client.localPlayerIndex) {
                    var17 = WorldMapSprite.localPlayer;
                } else {
                    var17 = Client.players[var2];
                }
                if (var17 != null) {
                    ObjectComposition var18 = ParamComposition.getObjectDefinition(var16);
                    int var19;
                    int var20;
                    if ((var11 != 1) && (var11 != 3)) {
                        var19 = var18.sizeX;
                        var20 = var18.sizeY;
                    } else {
                        var19 = var18.sizeY;
                        var20 = var18.sizeX;
                    }
                    int var21 = var7 + (var19 >> 1);
                    int var22 = var7 + ((var19 + 1) >> 1);
                    int var23 = var8 + (var20 >> 1);
                    int var24 = var8 + ((var20 + 1) >> 1);
                    int[][] var25 = Tiles.Tiles_heights[SoundSystem.Client_plane];
                    int var26 = (((var25[var22][var24] + var25[var21][var24]) + var25[var21][var23]) + var25[var22][var23]) >> 2;
                    int var27 = (var7 << 7) + (var19 << 6);
                    int var28 = (var8 << 7) + (var20 << 6);
                    Model var29 = var18.getModel(var10, var11, var25, var27, var26, var28);
                    if (var29 != null) {
                        AbstractWorldMapData.updatePendingSpawn(SoundSystem.Client_plane, var7, var8, var12, -1, 0, 0, var4 + 1, var5 + 1);
                        var17.animationCycleStart = var4 + Client.cycle;
                        var17.animationCycleEnd = var5 + Client.cycle;
                        var17.model0 = var29;
                        var17.field1075 = (var19 * 64) + (var7 * 128);
                        var17.field1077 = (var20 * 64) + (var8 * 128);
                        var17.tileHeight2 = var26;
                        byte var30;
                        if (var14 > var3) {
                            var30 = var14;
                            var14 = var3;
                            var3 = var30;
                        }
                        if (var15 > var13) {
                            var30 = var15;
                            var15 = var13;
                            var13 = var30;
                        }
                        var17.minX = var14 + var7;
                        var17.maxX = var7 + var3;
                        var17.minY = var15 + var8;
                        var17.maxY = var13 + var8;
                    }
                }
            }
            TileItem var33;
            if (class255.field2941 == var0) {
                var2 = var1.readUnsignedShort();
                var38 = var1.readUnsignedShortAddLE();
                var4 = var1.readUnsignedByteAdd();
                var5 = ((var4 >> 4) & 7) + class33.field243;
                var6 = (var4 & 7) + Canvas.field157;
                if ((((var5 >= 0) && (var6 >= 0)) && (var5 < 104)) && (var6 < 104)) {
                    var33 = new TileItem();
                    var33.id = var38;
                    var33.quantity = var2;
                    if (Client.groundItems[SoundSystem.Client_plane][var5][var6] == null) {
                        Client.groundItems[SoundSystem.Client_plane][var5][var6] = new NodeDeque();
                    }
                    Client.groundItems[SoundSystem.Client_plane][var5][var6].addFirst(var33);
                    StudioGame.updateItemPile(var5, var6);
                }
            } else if (class255.field2945 == var0) {
                var2 = var1.readUnsignedShort();
                var38 = var1.readUnsignedByteNeg();
                var4 = var38 >> 2;
                var5 = var38 & 3;
                var6 = Client.field565[var4];
                var7 = var1.readUnsignedByteNeg();
                var8 = ((var7 >> 4) & 7) + class33.field243;
                var9 = (var7 & 7) + Canvas.field157;
                if ((((var8 >= 0) && (var9 >= 0)) && (var8 < 104)) && (var9 < 104)) {
                    AbstractWorldMapData.updatePendingSpawn(SoundSystem.Client_plane, var8, var9, var6, var2, var4, var5, 0, -1);
                }
            } else if (class255.field2949 == var0) {
                var2 = var1.readUnsignedByteAdd();
                var38 = ((var2 >> 4) & 7) + class33.field243;
                var4 = (var2 & 7) + Canvas.field157;
                var5 = var1.readUnsignedByteAdd();
                var6 = var1.readUnsignedShortAdd();
                var7 = var1.readUnsignedShortLE();
                if ((((var38 >= 0) && (var4 >= 0)) && (var38 < 104)) && (var4 < 104)) {
                    var38 = (var38 * 128) + 64;
                    var4 = (var4 * 128) + 64;
                    GraphicsObject var34 = new GraphicsObject(var6, SoundSystem.Client_plane, var38, var4, class92.getTileHeight(var38, var4, SoundSystem.Client_plane) - var5, var7, Client.cycle);
                    Client.graphicsObjects.addFirst(var34);
                }
            } else {
                if (class255.field2950 == var0) {
                    var2 = var1.readUnsignedByte();
                    var38 = (var2 >> 4) & 15;
                    var4 = var2 & 7;
                    var5 = var1.readUnsignedShortAddLE();
                    var6 = var1.readUnsignedByteAdd();
                    var7 = var1.readUnsignedByteAdd();
                    var8 = ((var7 >> 4) & 7) + class33.field243;
                    var9 = (var7 & 7) + Canvas.field157;
                    if ((((var8 >= 0) && (var9 >= 0)) && (var8 < 104)) && (var9 < 104)) {
                        var10 = var38 + 1;
                        if (((((((WorldMapSprite.localPlayer.pathX[0] >= (var8 - var10)) && (WorldMapSprite.localPlayer.pathX[0] <= (var10 + var8))) && (WorldMapSprite.localPlayer.pathY[0] >= (var9 - var10))) && (WorldMapSprite.localPlayer.pathY[0] <= (var9 + var10))) && (class424.clientPreferences.areaSoundEffectsVolume != 0)) && (var4 > 0)) && (Client.soundEffectCount < 50)) {
                            Client.soundEffectIds[Client.soundEffectCount] = var5;
                            Client.queuedSoundEffectLoops[Client.soundEffectCount] = var4;
                            Client.queuedSoundEffectDelays[Client.soundEffectCount] = var6;
                            Client.soundEffects[Client.soundEffectCount] = null;
                            Client.soundLocations[Client.soundEffectCount] = (var38 + (var9 << 8)) + (var8 << 16);
                            ++Client.soundEffectCount;
                        }
                    }
                }
                if (class255.field2944 == var0) {
                    var2 = var1.readUnsignedByteNeg();
                    var38 = ((var2 >> 4) & 7) + class33.field243;
                    var4 = (var2 & 7) + Canvas.field157;
                    var5 = var1.readUnsignedByteSub();
                    var6 = var5 >> 2;
                    var7 = var5 & 3;
                    var8 = Client.field565[var6];
                    if ((((var38 >= 0) && (var4 >= 0)) && (var38 < 104)) && (var4 < 104)) {
                        AbstractWorldMapData.updatePendingSpawn(SoundSystem.Client_plane, var38, var4, var8, -1, var6, var7, 0, -1);
                    }
                } else if (class255.field2943 != var0) {
                    if (class255.field2948 == var0) {
                        byte var37 = var1.readByteSub();
                        var3 = var1.readByteSub();
                        var4 = var1.readUnsignedShortLE();
                        var5 = var1.method7409();
                        var6 = var1.readUnsignedShortLE();
                        var7 = var1.readUnsignedByteSub() * 4;
                        var8 = var1.readUnsignedByteAdd();
                        var9 = var1.readUnsignedShortLE();
                        var10 = var1.readUnsignedByteAdd() * 4;
                        var11 = var1.readUnsignedByteSub();
                        var12 = ((var11 >> 4) & 7) + class33.field243;
                        int var39 = (var11 & 7) + Canvas.field157;
                        int var40 = var1.readUnsignedByteSub();
                        var2 = var37 + var12;
                        var38 = var3 + var39;
                        if (((((((((var12 >= 0) && (var39 >= 0)) && (var12 < 104)) && (var39 < 104)) && (var2 >= 0)) && (var38 >= 0)) && (var2 < 104)) && (var38 < 104)) && (var4 != 65535)) {
                            var12 = (var12 * 128) + 64;
                            var39 = (var39 * 128) + 64;
                            var2 = (var2 * 128) + 64;
                            var38 = (var38 * 128) + 64;
                            Projectile var31 = new Projectile(var4, SoundSystem.Client_plane, var12, var39, class92.getTileHeight(var12, var39, SoundSystem.Client_plane) - var7, var6 + Client.cycle, var9 + Client.cycle, var40, var8, var5, var10);
                            var31.setDestination(var2, var38, class92.getTileHeight(var2, var38, SoundSystem.Client_plane) - var10, var6 + Client.cycle);
                            Client.projectiles.addFirst(var31);
                        }
                    }
                } else {
                    var2 = var1.readUnsignedShortLE();
                    var38 = var1.readUnsignedByteAdd();
                    var4 = ((var38 >> 4) & 7) + class33.field243;
                    var5 = (var38 & 7) + Canvas.field157;
                    if ((((var4 >= 0) && (var5 >= 0)) && (var4 < 104)) && (var5 < 104)) {
                        NodeDeque var32 = Client.groundItems[SoundSystem.Client_plane][var4][var5];
                        if (var32 != null) {
                            for (var33 = ((TileItem) (var32.last())); var33 != null; var33 = ((TileItem) (var32.previous()))) {
                                if ((var2 & 32767) == var33.id) {
                                    var33.remove();
                                    break;
                                }
                            }
                            if (var32.last() == null) {
                                Client.groundItems[SoundSystem.Client_plane][var4][var5] = null;
                            }
                            StudioGame.updateItemPile(var4, var5);
                        }
                    }
                }
            }
        }
    }
}