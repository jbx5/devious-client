import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("od")
@Implements("UserList")
public abstract class UserList {
   @ObfuscatedName("u")
   @ObfuscatedGetter(
      intValue = -1701166139
   )
   @Export("capacity")
   final int capacity;
   @ObfuscatedName("b")
   @ObfuscatedGetter(
      intValue = -809601657
   )
   @Export("size")
   int size = 0;
   @ObfuscatedName("j")
   @ObfuscatedSignature(
      descriptor = "[Lov;"
   )
   @Export("array")
   User[] array;
   @ObfuscatedName("g")
   @Export("usernamesMap")
   HashMap usernamesMap;
   @ObfuscatedName("i")
   @Export("previousUsernamesMap")
   HashMap previousUsernamesMap;
   @ObfuscatedName("o")
   @Export("comparator")
   Comparator comparator = null;

   UserList(int var1) {
      this.capacity = var1;
      this.array = this.newTypedArray(var1);
      this.usernamesMap = new HashMap(var1 / 8);
      this.previousUsernamesMap = new HashMap(var1 / 8);
   }

   @ObfuscatedName("h")
   @ObfuscatedSignature(
      descriptor = "(B)Lov;",
      garbageValue = "47"
   )
   @Export("newInstance")
   abstract User newInstance();

   @ObfuscatedName("e")
   @ObfuscatedSignature(
      descriptor = "(II)[Lov;",
      garbageValue = "1710517567"
   )
   @Export("newTypedArray")
   abstract User[] newTypedArray(int var1);

   @ObfuscatedName("ar")
   @ObfuscatedSignature(
      descriptor = "(S)V",
      garbageValue = "-3750"
   )
   @Export("clear")
   public void clear() {
      this.size = 0;
      Arrays.fill(this.array, (Object)null);
      this.usernamesMap.clear();
      this.previousUsernamesMap.clear();
   }

   @ObfuscatedName("at")
   @ObfuscatedSignature(
      descriptor = "(I)I",
      garbageValue = "994958809"
   )
   @Export("getSize")
   public int getSize() {
      return this.size;
   }

   @ObfuscatedName("ay")
   @ObfuscatedSignature(
      descriptor = "(I)Z",
      garbageValue = "-1236533348"
   )
   @Export("isFull")
   public boolean isFull() {
      return this.capacity == this.size;
   }

   @ObfuscatedName("an")
   @ObfuscatedSignature(
      descriptor = "(Lrp;B)Z",
      garbageValue = "-94"
   )
   @Export("contains")
   public boolean contains(Username var1) {
      if (!var1.hasCleanName()) {
         return false;
      } else {
         return this.usernamesMap.containsKey(var1) ? true : this.previousUsernamesMap.containsKey(var1);
      }
   }

   @ObfuscatedName("ab")
   @ObfuscatedSignature(
      descriptor = "(Lrp;B)Lov;",
      garbageValue = "-51"
   )
   @Export("getByUsername")
   public User getByUsername(Username var1) {
      User var2 = this.getByCurrentUsername(var1);
      return var2 != null ? var2 : this.getByPreviousUsername(var1);
   }

   @ObfuscatedName("al")
   @ObfuscatedSignature(
      descriptor = "(Lrp;B)Lov;",
      garbageValue = "49"
   )
   @Export("getByCurrentUsername")
   User getByCurrentUsername(Username var1) {
      return !var1.hasCleanName() ? null : (User)this.usernamesMap.get(var1);
   }

   @ObfuscatedName("ag")
   @ObfuscatedSignature(
      descriptor = "(Lrp;I)Lov;",
      garbageValue = "-2064272196"
   )
   @Export("getByPreviousUsername")
   User getByPreviousUsername(Username var1) {
      return !var1.hasCleanName() ? null : (User)this.previousUsernamesMap.get(var1);
   }

   @ObfuscatedName("az")
   @ObfuscatedSignature(
      descriptor = "(Lrp;B)Z",
      garbageValue = "88"
   )
   @Export("removeByUsername")
   public final boolean removeByUsername(Username var1) {
      User var2 = this.getByCurrentUsername(var1);
      if (var2 == null) {
         return false;
      } else {
         this.remove(var2);
         return true;
      }
   }

   @ObfuscatedName("ak")
   @ObfuscatedSignature(
      descriptor = "(Lov;I)V",
      garbageValue = "1943466022"
   )
   @Export("remove")
   final void remove(User var1) {
      int var2 = this.indexOf(var1);
      if (var2 != -1) {
         this.arrayRemove(var2);
         this.mapRemove(var1);
      }
   }

   @ObfuscatedName("af")
   @ObfuscatedSignature(
      descriptor = "(Lrp;B)Lov;",
      garbageValue = "83"
   )
   @Export("addLastNoPreviousUsername")
   User addLastNoPreviousUsername(Username var1) {
      return this.addLast(var1, (Username)null);
   }

   @ObfuscatedName("ai")
   @ObfuscatedSignature(
      descriptor = "(Lrp;Lrp;B)Lov;",
      garbageValue = "14"
   )
   @Export("addLast")
   User addLast(Username var1, Username var2) {
      if (this.getByCurrentUsername(var1) != null) {
         throw new IllegalStateException();
      } else {
         User var3 = this.newInstance();
         var3.set(var1, var2);
         this.arrayAddLast(var3);
         this.mapPut(var3);
         return var3;
      }
   }

   @ObfuscatedName("ax")
   @ObfuscatedSignature(
      descriptor = "(II)Lov;",
      garbageValue = "1687746324"
   )
   @Export("get")
   public final User get(int var1) {
      if (var1 >= 0 && var1 < this.size) {
         return this.array[var1];
      } else {
         throw new ArrayIndexOutOfBoundsException(var1);
      }
   }

   @ObfuscatedName("ah")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "1745034831"
   )
   @Export("sort")
   public final void sort() {
      if (this.comparator == null) {
         Arrays.sort(this.array, 0, this.size);
      } else {
         Arrays.sort(this.array, 0, this.size, this.comparator);
      }

   }

   @ObfuscatedName("aw")
   @ObfuscatedSignature(
      descriptor = "(Lov;Lrp;Lrp;I)V",
      garbageValue = "-2046031890"
   )
   @Export("changeName")
   final void changeName(User var1, Username var2, Username var3) {
      this.mapRemove(var1);
      var1.set(var2, var3);
      this.mapPut(var1);
   }

   @ObfuscatedName("aj")
   @ObfuscatedSignature(
      descriptor = "(Lov;I)I",
      garbageValue = "-2074650395"
   )
   @Export("indexOf")
   final int indexOf(User var1) {
      for(int var2 = 0; var2 < this.size; ++var2) {
         if (this.array[var2] == var1) {
            return var2;
         }
      }

      return -1;
   }

   @ObfuscatedName("aq")
   @ObfuscatedSignature(
      descriptor = "(Lov;B)V",
      garbageValue = "0"
   )
   @Export("mapRemove")
   final void mapRemove(User var1) {
      if (this.usernamesMap.remove(var1.username) == null) {
         throw new IllegalStateException();
      } else {
         if (var1.previousUsername != null) {
            this.previousUsernamesMap.remove(var1.previousUsername);
         }

      }
   }

   @ObfuscatedName("ap")
   @ObfuscatedSignature(
      descriptor = "(Lov;I)V",
      garbageValue = "-653934670"
   )
   @Export("arrayAddLast")
   final void arrayAddLast(User var1) {
      this.array[++this.size - 1] = var1;
   }

   @ObfuscatedName("aa")
   @ObfuscatedSignature(
      descriptor = "(Lov;I)V",
      garbageValue = "734290139"
   )
   @Export("mapPut")
   final void mapPut(User var1) {
      this.usernamesMap.put(var1.username, var1);
      if (var1.previousUsername != null) {
         User var2 = (User)this.previousUsernamesMap.put(var1.previousUsername, var1);
         if (var2 != null && var2 != var1) {
            var2.previousUsername = null;
         }
      }

   }

   @ObfuscatedName("ae")
   @ObfuscatedSignature(
      descriptor = "(IB)V",
      garbageValue = "2"
   )
   @Export("arrayRemove")
   final void arrayRemove(int var1) {
      --this.size;
      if (var1 < this.size) {
         System.arraycopy(this.array, var1 + 1, this.array, var1, this.size - var1);
      }

   }

   @ObfuscatedName("ac")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "-1713851061"
   )
   @Export("removeComparator")
   public final void removeComparator() {
      this.comparator = null;
   }

   @ObfuscatedName("bh")
   @ObfuscatedSignature(
      descriptor = "(Ljava/util/Comparator;I)V",
      garbageValue = "1352931205"
   )
   @Export("addComparator")
   public final void addComparator(Comparator var1) {
      if (this.comparator == null) {
         this.comparator = var1;
      } else if (this.comparator instanceof AbstractUserComparator) {
         ((AbstractUserComparator)this.comparator).addComparator(var1);
      }

   }

   @ObfuscatedName("v")
   @ObfuscatedSignature(
      descriptor = "(CI)C",
      garbageValue = "-852063188"
   )
   public static char method7589(char var0) {
      switch (var0) {
         case ' ':
         case '-':
         case '_':
         case ' ':
            return '_';
         case '#':
         case '[':
         case ']':
            return var0;
         case 'À':
         case 'Á':
         case 'Â':
         case 'Ã':
         case 'Ä':
         case 'à':
         case 'á':
         case 'â':
         case 'ã':
         case 'ä':
            return 'a';
         case 'Ç':
         case 'ç':
            return 'c';
         case 'È':
         case 'É':
         case 'Ê':
         case 'Ë':
         case 'è':
         case 'é':
         case 'ê':
         case 'ë':
            return 'e';
         case 'Í':
         case 'Î':
         case 'Ï':
         case 'í':
         case 'î':
         case 'ï':
            return 'i';
         case 'Ñ':
         case 'ñ':
            return 'n';
         case 'Ò':
         case 'Ó':
         case 'Ô':
         case 'Õ':
         case 'Ö':
         case 'ò':
         case 'ó':
         case 'ô':
         case 'õ':
         case 'ö':
            return 'o';
         case 'Ù':
         case 'Ú':
         case 'Û':
         case 'Ü':
         case 'ù':
         case 'ú':
         case 'û':
         case 'ü':
            return 'u';
         case 'ß':
            return 'b';
         case 'ÿ':
         case 'Ÿ':
            return 'y';
         default:
            return Character.toLowerCase(var0);
      }
   }
}
