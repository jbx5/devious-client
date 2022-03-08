import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
@ObfuscatedName("pb")
@Implements("Username")
public class Username implements Comparable {
    @ObfuscatedName("c")
    @Export("name")
    String name;

    @ObfuscatedName("l")
    @Export("cleanName")
    String cleanName;

    @ObfuscatedSignature(descriptor = "(Ljava/lang/String;Lok;)V")
    public Username(String var1, LoginType var2) {
        this.name = var1;
        String var4;
        if (var1 == null) {
            var4 = null;
        } else {
            int var5 = 0;
            int var6;
            for (var6 = var1.length(); (var5 < var6) && class335.method6159(var1.charAt(var5)); ++var5) {
            }
            while ((var6 > var5) && class335.method6159(var1.charAt(var6 - 1))) {
                --var6;
            } 
            int var7 = var6 - var5;
            if ((var7 >= 1) && (var7 <= FriendsChat.method6330(var2))) {
                StringBuilder var8 = new StringBuilder(var7);
                for (int var9 = var5; var9 < var6; ++var9) {
                    char var10 = var1.charAt(var9);
                    boolean var11;
                    if (Character.isISOControl(var10)) {
                        var11 = false;
                    } else if (class124.isAlphaNumeric(var10)) {
                        var11 = true;
                    } else {
                        char[] var12 = class405.field4460;
                        int var13 = 0;
                        label84 : while (true) {
                            char var14;
                            if (var13 >= var12.length) {
                                var12 = class405.field4461;
                                for (var13 = 0; var13 < var12.length; ++var13) {
                                    var14 = var12[var13];
                                    if (var14 == var10) {
                                        var11 = true;
                                        break label84;
                                    }
                                }
                                var11 = false;
                                break;
                            }
                            var14 = var12[var13];
                            if (var10 == var14) {
                                var11 = true;
                                break;
                            }
                            ++var13;
                        } 
                    }
                    if (var11) {
                        char var15;
                        switch (var10) {
                            case ' ' :
                            case '-' :
                            case '_' :
                            case ' ' :
                                var15 = '_';
                                break;
                            case '#' :
                            case '[' :
                            case ']' :
                                var15 = var10;
                                break;
                            case 'À' :
                            case 'Á' :
                            case 'Â' :
                            case 'Ã' :
                            case 'Ä' :
                            case 'à' :
                            case 'á' :
                            case 'â' :
                            case 'ã' :
                            case 'ä' :
                                var15 = 'a';
                                break;
                            case 'Ç' :
                            case 'ç' :
                                var15 = 'c';
                                break;
                            case 'È' :
                            case 'É' :
                            case 'Ê' :
                            case 'Ë' :
                            case 'è' :
                            case 'é' :
                            case 'ê' :
                            case 'ë' :
                                var15 = 'e';
                                break;
                            case 'Í' :
                            case 'Î' :
                            case 'Ï' :
                            case 'í' :
                            case 'î' :
                            case 'ï' :
                                var15 = 'i';
                                break;
                            case 'Ñ' :
                            case 'ñ' :
                                var15 = 'n';
                                break;
                            case 'Ò' :
                            case 'Ó' :
                            case 'Ô' :
                            case 'Õ' :
                            case 'Ö' :
                            case 'ò' :
                            case 'ó' :
                            case 'ô' :
                            case 'õ' :
                            case 'ö' :
                                var15 = 'o';
                                break;
                            case 'Ù' :
                            case 'Ú' :
                            case 'Û' :
                            case 'Ü' :
                            case 'ù' :
                            case 'ú' :
                            case 'û' :
                            case 'ü' :
                                var15 = 'u';
                                break;
                            case 'ß' :
                                var15 = 'b';
                                break;
                            case 'ÿ' :
                            case 'Ÿ' :
                                var15 = 'y';
                                break;
                            default :
                                var15 = Character.toLowerCase(var10);
                        }
                        if (var15 != 0) {
                            var8.append(var15);
                        }
                    }
                }
                if (var8.length() == 0) {
                    var4 = null;
                } else {
                    var4 = var8.toString();
                }
            } else {
                var4 = null;
            }
        }
        this.cleanName = var4;
    }

    public Username(String var1) {
        this.name = var1;
        LoginType var4 = LoginType.oldscape;
        String var3;
        if (var1 == null) {
            var3 = null;
        } else {
            int var5 = 0;
            int var6;
            for (var6 = var1.length(); (var5 < var6) && class335.method6159(var1.charAt(var5)); ++var5) {
            }
            while ((var6 > var5) && class335.method6159(var1.charAt(var6 - 1))) {
                --var6;
            } 
            int var7 = var6 - var5;
            if ((var7 >= 1) && (var7 <= FriendsChat.method6330(var4))) {
                StringBuilder var8 = new StringBuilder(var7);
                for (int var9 = var5; var9 < var6; ++var9) {
                    char var10 = var1.charAt(var9);
                    boolean var11;
                    if (Character.isISOControl(var10)) {
                        var11 = false;
                    } else if (class124.isAlphaNumeric(var10)) {
                        var11 = true;
                    } else {
                        char[] var12 = class405.field4460;
                        int var13 = 0;
                        label83 : while (true) {
                            char var14;
                            if (var13 >= var12.length) {
                                var12 = class405.field4461;
                                for (var13 = 0; var13 < var12.length; ++var13) {
                                    var14 = var12[var13];
                                    if (var10 == var14) {
                                        var11 = true;
                                        break label83;
                                    }
                                }
                                var11 = false;
                                break;
                            }
                            var14 = var12[var13];
                            if (var10 == var14) {
                                var11 = true;
                                break;
                            }
                            ++var13;
                        } 
                    }
                    if (var11) {
                        char var15;
                        switch (var10) {
                            case ' ' :
                            case '-' :
                            case '_' :
                            case ' ' :
                                var15 = '_';
                                break;
                            case '#' :
                            case '[' :
                            case ']' :
                                var15 = var10;
                                break;
                            case 'À' :
                            case 'Á' :
                            case 'Â' :
                            case 'Ã' :
                            case 'Ä' :
                            case 'à' :
                            case 'á' :
                            case 'â' :
                            case 'ã' :
                            case 'ä' :
                                var15 = 'a';
                                break;
                            case 'Ç' :
                            case 'ç' :
                                var15 = 'c';
                                break;
                            case 'È' :
                            case 'É' :
                            case 'Ê' :
                            case 'Ë' :
                            case 'è' :
                            case 'é' :
                            case 'ê' :
                            case 'ë' :
                                var15 = 'e';
                                break;
                            case 'Í' :
                            case 'Î' :
                            case 'Ï' :
                            case 'í' :
                            case 'î' :
                            case 'ï' :
                                var15 = 'i';
                                break;
                            case 'Ñ' :
                            case 'ñ' :
                                var15 = 'n';
                                break;
                            case 'Ò' :
                            case 'Ó' :
                            case 'Ô' :
                            case 'Õ' :
                            case 'Ö' :
                            case 'ò' :
                            case 'ó' :
                            case 'ô' :
                            case 'õ' :
                            case 'ö' :
                                var15 = 'o';
                                break;
                            case 'Ù' :
                            case 'Ú' :
                            case 'Û' :
                            case 'Ü' :
                            case 'ù' :
                            case 'ú' :
                            case 'û' :
                            case 'ü' :
                                var15 = 'u';
                                break;
                            case 'ß' :
                                var15 = 'b';
                                break;
                            case 'ÿ' :
                            case 'Ÿ' :
                                var15 = 'y';
                                break;
                            default :
                                var15 = Character.toLowerCase(var10);
                        }
                        if (var15 != 0) {
                            var8.append(var15);
                        }
                    }
                }
                if (var8.length() == 0) {
                    var3 = null;
                } else {
                    var3 = var8.toString();
                }
            } else {
                var3 = null;
            }
        }
        this.cleanName = var3;
    }

    @ObfuscatedName("c")
    @ObfuscatedSignature(descriptor = "(I)Ljava/lang/String;", garbageValue = "1210875382")
    @Export("getName")
    public String getName() {
        return this.name;
    }

    @ObfuscatedName("l")
    @ObfuscatedSignature(descriptor = "(S)Ljava/lang/String;", garbageValue = "301")
    public String method7949() {
        return this.cleanName;
    }

    @ObfuscatedName("s")
    @ObfuscatedSignature(descriptor = "(I)Z", garbageValue = "1707838150")
    @Export("hasCleanName")
    public boolean hasCleanName() {
        return this.cleanName != null;
    }

    @ObfuscatedName("e")
    @ObfuscatedSignature(descriptor = "(Lpb;I)I", garbageValue = "1152761803")
    @Export("compareToTyped")
    public int compareToTyped(Username var1) {
        if (this.cleanName == null) {
            return var1.cleanName == null ? 0 : 1;
        } else {
            return var1.cleanName == null ? -1 : this.cleanName.compareTo(var1.cleanName);
        }
    }

    public boolean equals(Object var1) {
        if (var1 instanceof Username) {
            Username var2 = ((Username) (var1));
            if (this.cleanName == null) {
                return var2.cleanName == null;
            } else if (var2.cleanName == null) {
                return false;
            } else {
                return this.hashCode() != var2.hashCode() ? false : this.cleanName.equals(var2.cleanName);
            }
        } else {
            return false;
        }
    }

    public int hashCode() {
        return this.cleanName == null ? 0 : this.cleanName.hashCode();
    }

    public String toString() {
        return this.getName();
    }

    public int compareTo(Object var1) {
        return this.compareToTyped(((Username) (var1)));
    }
}