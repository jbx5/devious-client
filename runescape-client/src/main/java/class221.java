import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
@ObfuscatedName("hk")
public class class221 implements WorldMapSection {
    @ObfuscatedName("pd")
    @ObfuscatedSignature(descriptor = "Lnh;")
    static class375 field2680;

    @ObfuscatedName("c")
    @ObfuscatedGetter(intValue = -1476515463)
    int field2690;

    @ObfuscatedName("l")
    @ObfuscatedGetter(intValue = 654724429)
    int field2687;

    @ObfuscatedName("s")
    @ObfuscatedGetter(intValue = 1376537717)
    int field2681;

    @ObfuscatedName("e")
    @ObfuscatedGetter(intValue = -956224345)
    int field2679;

    @ObfuscatedName("r")
    @ObfuscatedGetter(intValue = 1954446807)
    int field2688;

    @ObfuscatedName("o")
    @ObfuscatedGetter(intValue = 852075819)
    int field2684;

    @ObfuscatedName("i")
    @ObfuscatedGetter(intValue = -1302751213)
    int field2685;

    @ObfuscatedName("w")
    @ObfuscatedGetter(intValue = 973794983)
    int field2683;

    @ObfuscatedName("v")
    @ObfuscatedGetter(intValue = 1012984099)
    int field2686;

    @ObfuscatedName("a")
    @ObfuscatedGetter(intValue = 1516865303)
    int field2682;

    class221() {
    }

    @ObfuscatedName("c")
    @ObfuscatedSignature(descriptor = "(Lhm;I)V", garbageValue = "806489369")
    @Export("expandBounds")
    public void expandBounds(WorldMapArea var1) {
        if (var1.regionLowX > this.field2688) {
            var1.regionLowX = this.field2688;
        }
        if (var1.regionHighX < this.field2688) {
            var1.regionHighX = this.field2688;
        }
        if (var1.regionLowY > this.field2684) {
            var1.regionLowY = this.field2684;
        }
        if (var1.regionHighY < this.field2684) {
            var1.regionHighY = this.field2684;
        }
    }

    @ObfuscatedName("l")
    @ObfuscatedSignature(descriptor = "(IIII)Z", garbageValue = "1721879281")
    @Export("containsCoord")
    public boolean containsCoord(int var1, int var2, int var3) {
        if ((var1 >= this.field2690) && (var1 < (this.field2690 + this.field2687))) {
            return (((var2 >= ((this.field2681 << 6) + (this.field2685 << 3))) && (var2 <= (((this.field2681 << 6) + (this.field2685 << 3)) + 7))) && (var3 >= ((this.field2679 << 6) + (this.field2683 << 3)))) && (var3 <= (((this.field2679 << 6) + (this.field2683 << 3)) + 7));
        } else {
            return false;
        }
    }

    @ObfuscatedName("s")
    @ObfuscatedSignature(descriptor = "(III)Z", garbageValue = "898039462")
    @Export("containsPosition")
    public boolean containsPosition(int var1, int var2) {
        return (((var1 >= ((this.field2688 << 6) + (this.field2686 << 3))) && (var1 <= (((this.field2688 << 6) + (this.field2686 << 3)) + 7))) && (var2 >= ((this.field2684 << 6) + (this.field2682 << 3)))) && (var2 <= (((this.field2684 << 6) + (this.field2682 << 3)) + 7));
    }

    @ObfuscatedName("e")
    @ObfuscatedSignature(descriptor = "(IIII)[I", garbageValue = "499785766")
    @Export("getBorderTileLengths")
    public int[] getBorderTileLengths(int var1, int var2, int var3) {
        if (!this.containsCoord(var1, var2, var3)) {
            return null;
        } else {
            int[] var4 = new int[]{ (var2 + ((this.field2688 * 64) - (this.field2681 * 64))) + ((this.field2686 * 8) - (this.field2685 * 8)), (var3 + ((this.field2684 * 64) - (this.field2679 * 64))) + ((this.field2682 * 8) - (this.field2683 * 8)) };
            return var4;
        }
    }

    @ObfuscatedName("r")
    @ObfuscatedSignature(descriptor = "(IIB)Ljd;", garbageValue = "90")
    @Export("coord")
    public Coord coord(int var1, int var2) {
        if (!this.containsPosition(var1, var2)) {
            return null;
        } else {
            int var3 = (((this.field2681 * 64) - (this.field2688 * 64)) + ((this.field2685 * 8) - (this.field2686 * 8))) + var1;
            int var4 = (var2 + ((this.field2679 * 64) - (this.field2684 * 64))) + ((this.field2683 * 8) - (this.field2682 * 8));
            return new Coord(this.field2690, var3, var4);
        }
    }

    @ObfuscatedName("o")
    @ObfuscatedSignature(descriptor = "(Lpi;B)V", garbageValue = "-121")
    @Export("read")
    public void read(Buffer var1) {
        this.field2690 = var1.readUnsignedByte();
        this.field2687 = var1.readUnsignedByte();
        this.field2681 = var1.readUnsignedShort();
        this.field2685 = var1.readUnsignedByte();
        this.field2679 = var1.readUnsignedShort();
        this.field2683 = var1.readUnsignedByte();
        this.field2688 = var1.readUnsignedShort();
        this.field2686 = var1.readUnsignedByte();
        this.field2684 = var1.readUnsignedShort();
        this.field2682 = var1.readUnsignedByte();
        this.method4647();
    }

    @ObfuscatedName("i")
    @ObfuscatedSignature(descriptor = "(B)V", garbageValue = "-14")
    void method4647() {
    }

    @ObfuscatedName("s")
    @ObfuscatedSignature(descriptor = "(B)I", garbageValue = "64")
    public static int method4644() {
        return (++MouseHandler.MouseHandler_idleCycles) - 1;
    }

    @ObfuscatedName("fr")
    @ObfuscatedSignature(descriptor = "(II)V", garbageValue = "-2090450299")
    @Export("getLoginError")
    static void getLoginError(int var0) {
        if (var0 == (-3)) {
            UserComparator7.setLoginResponseString("Connection timed out.", "Please try using a different world.", "");
        } else if (var0 == (-2)) {
            UserComparator7.setLoginResponseString("Error connecting to server.", "Please try using a different world.", "");
        } else if (var0 == (-1)) {
            UserComparator7.setLoginResponseString("No response from server.", "Please try using a different world.", "");
        } else if (var0 == 3) {
            Player.method2159(3);
            Login.field918 = 1;
        } else if (var0 == 4) {
            Player.method2159(14);
            Login.Login_banType = 0;
        } else if (var0 == 5) {
            Login.field918 = 2;
            UserComparator7.setLoginResponseString("Your account has not logged out from its last", "session or the server is too busy right now.", "Please try again in a few minutes.");
        } else if ((var0 == 68) || ((!Client.onMobile) && (var0 == 6))) {
            UserComparator7.setLoginResponseString("RuneScape has been updated!", "Please reload this page.", "");
        } else if (var0 == 7) {
            UserComparator7.setLoginResponseString("This world is full.", "Please use a different world.", "");
        } else if (var0 == 8) {
            UserComparator7.setLoginResponseString("Unable to connect.", "Login server offline.", "");
        } else if (var0 == 9) {
            UserComparator7.setLoginResponseString("Login limit exceeded.", "Too many connections from your address.", "");
        } else if (var0 == 10) {
            UserComparator7.setLoginResponseString("Unable to connect.", "Bad session id.", "");
        } else if (var0 == 11) {
            UserComparator7.setLoginResponseString("We suspect someone knows your password.", "Press 'change your password' on front page.", "");
        } else if (var0 == 12) {
            UserComparator7.setLoginResponseString("You need a members account to login to this world.", "Please subscribe, or use a different world.", "");
        } else if (var0 == 13) {
            UserComparator7.setLoginResponseString("Could not complete login.", "Please try using a different world.", "");
        } else if (var0 == 14) {
            UserComparator7.setLoginResponseString("The server is being updated.", "Please wait 1 minute and try again.", "");
        } else if (var0 == 16) {
            UserComparator7.setLoginResponseString("Too many login attempts.", "Please wait a few minutes before trying again.", "");
        } else if (var0 == 17) {
            UserComparator7.setLoginResponseString("You are standing in a members-only area.", "To play on this world move to a free area first", "");
        } else if (var0 == 18) {
            Player.method2159(14);
            Login.Login_banType = 1;
        } else if (var0 == 19) {
            UserComparator7.setLoginResponseString("This world is running a closed Beta.", "Sorry invited players only.", "Please use a different world.");
        } else if (var0 == 20) {
            UserComparator7.setLoginResponseString("Invalid loginserver requested.", "Please try using a different world.", "");
        } else if (var0 == 22) {
            UserComparator7.setLoginResponseString("Malformed login packet.", "Please try again.", "");
        } else if (var0 == 23) {
            UserComparator7.setLoginResponseString("No reply from loginserver.", "Please wait 1 minute and try again.", "");
        } else if (var0 == 24) {
            UserComparator7.setLoginResponseString("Error loading your profile.", "Please contact customer support.", "");
        } else if (var0 == 25) {
            UserComparator7.setLoginResponseString("Unexpected loginserver response.", "Please try using a different world.", "");
        } else if (var0 == 26) {
            UserComparator7.setLoginResponseString("This computers address has been blocked", "as it was used to break our rules.", "");
        } else if (var0 == 27) {
            UserComparator7.setLoginResponseString("", "Service unavailable.", "");
        } else if (var0 == 31) {
            UserComparator7.setLoginResponseString("Your account must have a displayname set", "in order to play the game.  Please set it", "via the website, or the main game.");
        } else if (var0 == 32) {
            UserComparator7.setLoginResponseString("Your attempt to log into your account was", "unsuccessful.  Don't worry, you can sort", "this out by visiting the billing system.");
        } else if (var0 == 37) {
            UserComparator7.setLoginResponseString("Your account is currently inaccessible.", "Please try again in a few minutes.", "");
        } else if (var0 == 38) {
            UserComparator7.setLoginResponseString("You need to vote to play!", "Visit runescape.com and vote,", "and then come back here!");
        } else if (var0 == 55) {
            Player.method2159(8);
        } else {
            if (var0 == 56) {
                UserComparator7.setLoginResponseString("Enter the 6-digit code generated by your", "authenticator app.", "");
                class111.updateGameState(11);
                return;
            }
            if (var0 == 57) {
                UserComparator7.setLoginResponseString("The code you entered was incorrect.", "Please try again.", "");
                class111.updateGameState(11);
                return;
            }
            if (var0 == 61) {
                UserComparator7.setLoginResponseString("", "Please enter your date of birth (DD/MM/YYYY)", "");
                Player.method2159(7);
            } else {
                if (var0 == 62) {
                    class111.updateGameState(10);
                    Player.method2159(9);
                    UserComparator7.setLoginResponseString("Login attempt timed out.", "Please try again.", "");
                    return;
                }
                if (var0 == 63) {
                    class111.updateGameState(10);
                    Player.method2159(9);
                    UserComparator7.setLoginResponseString("You were signed out.", "Please sign in again.", "");
                    return;
                }
                if ((var0 == 65) || (var0 == 67)) {
                    class111.updateGameState(10);
                    Player.method2159(9);
                    UserComparator7.setLoginResponseString("Failed to login.", "Please try again.", "");
                    return;
                }
                if (var0 == 70) {
                    UserComparator7.setLoginResponseString("", "Connecting to server...", "");
                    class111.updateGameState(20);
                    WorldMapLabelSize.method4321(0);
                    return;
                }
                if (var0 == 71) {
                    class111.updateGameState(10);
                    Player.method2159(7);
                    UserComparator7.setLoginResponseString("There was a problem updating your DOB.", "Please try again later. If the problem ", "persists, please contact Jagex Support.");
                } else {
                    UserComparator7.setLoginResponseString("Unexpected server response", "Please try using a different world.", "");
                }
            }
        }
        class111.updateGameState(10);
        if (Client.field534.method7628()) {
            Player.method2159(9);
        }
    }
}