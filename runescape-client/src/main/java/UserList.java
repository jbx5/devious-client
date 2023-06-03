import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("qo")
@Implements("UserList")
public abstract class UserList {
   @ObfuscatedName("ae")
   @ObfuscatedGetter(
      intValue = -1754706209
   )
   @Export("capacity")
   final int capacity;
   @ObfuscatedName("af")
   @ObfuscatedGetter(
      intValue = -562364275
   )
   @Export("size")
   int size = 0;
   @ObfuscatedName("ao")
   @ObfuscatedSignature(
      descriptor = "[Lqm;"
   )
   @Export("array")
   User[] array;
   @ObfuscatedName("aa")
   @Export("usernamesMap")
   HashMap usernamesMap;
   @ObfuscatedName("aj")
   @Export("previousUsernamesMap")
   HashMap previousUsernamesMap;
   @ObfuscatedName("ad")
   @Export("comparator")
   Comparator comparator = null;

   UserList(int var1) {
      this.capacity = var1;
      this.array = this.newTypedArray(var1);
      this.usernamesMap = new HashMap(var1 / 8);
      this.previousUsernamesMap = new HashMap(var1 / 8);
   }

   @ObfuscatedName("at")
   @ObfuscatedSignature(
      descriptor = "(I)Lqm;",
      garbageValue = "328216456"
   )
   @Export("newInstance")
   abstract User newInstance();

   @ObfuscatedName("an")
   @ObfuscatedSignature(
      descriptor = "(IB)[Lqm;",
      garbageValue = "20"
   )
   @Export("newTypedArray")
   abstract User[] newTypedArray(int var1);

   @ObfuscatedName("bq")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "-1236059630"
   )
   @Export("clear")
   public void clear() {
      this.size = 0;
      Arrays.fill(this.array, (Object)null);
      this.usernamesMap.clear();
      this.previousUsernamesMap.clear();
   }

   @ObfuscatedName("bg")
   @ObfuscatedSignature(
      descriptor = "(I)I",
      garbageValue = "-643247285"
   )
   @Export("getSize")
   public int getSize() {
      return this.size;
   }

   @ObfuscatedName("bf")
   @ObfuscatedSignature(
      descriptor = "(B)Z",
      garbageValue = "26"
   )
   @Export("isFull")
   public boolean isFull() {
      return this.capacity == this.size;
   }

   @ObfuscatedName("bd")
   @ObfuscatedSignature(
      descriptor = "(Lun;B)Z",
      garbageValue = "110"
   )
   @Export("contains")
   public boolean contains(Username var1) {
      if (!var1.hasCleanName()) {
         return false;
      } else {
         return this.usernamesMap.containsKey(var1) ? true : this.previousUsernamesMap.containsKey(var1);
      }
   }

   @ObfuscatedName("ba")
   @ObfuscatedSignature(
      descriptor = "(Lun;I)Lqm;",
      garbageValue = "1113939995"
   )
   @Export("getByUsername")
   public User getByUsername(Username var1) {
      User var2 = this.getByCurrentUsername(var1);
      return var2 != null ? var2 : this.getByPreviousUsername(var1);
   }

   @ObfuscatedName("bn")
   @ObfuscatedSignature(
      descriptor = "(Lun;I)Lqm;",
      garbageValue = "672783260"
   )
   @Export("getByCurrentUsername")
   User getByCurrentUsername(Username var1) {
      return !var1.hasCleanName() ? null : (User)this.usernamesMap.get(var1);
   }

   @ObfuscatedName("bb")
   @ObfuscatedSignature(
      descriptor = "(Lun;I)Lqm;",
      garbageValue = "-1894630558"
   )
   @Export("getByPreviousUsername")
   User getByPreviousUsername(Username var1) {
      return !var1.hasCleanName() ? null : (User)this.previousUsernamesMap.get(var1);
   }

   @ObfuscatedName("bx")
   @ObfuscatedSignature(
      descriptor = "(Lun;I)Z",
      garbageValue = "1585008504"
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

   @ObfuscatedName("be")
   @ObfuscatedSignature(
      descriptor = "(Lqm;I)V",
      garbageValue = "1487138470"
   )
   @Export("remove")
   final void remove(User var1) {
      int var2 = this.indexOf(var1);
      if (var2 != -1) {
         this.arrayRemove(var2);
         this.mapRemove(var1);
      }
   }

   @ObfuscatedName("bh")
   @ObfuscatedSignature(
      descriptor = "(Lun;I)Lqm;",
      garbageValue = "344398023"
   )
   @Export("addLastNoPreviousUsername")
   User addLastNoPreviousUsername(Username var1) {
      return this.addLast(var1, (Username)null);
   }

   @ObfuscatedName("bp")
   @ObfuscatedSignature(
      descriptor = "(Lun;Lun;I)Lqm;",
      garbageValue = "-1449074058"
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

   @ObfuscatedName("bw")
   @ObfuscatedSignature(
      descriptor = "(IB)Lqm;",
      garbageValue = "-88"
   )
   @Export("get")
   public final User get(int var1) {
      if (var1 >= 0 && var1 < this.size) {
         return this.array[var1];
      } else {
         throw new ArrayIndexOutOfBoundsException(var1);
      }
   }

   @ObfuscatedName("bi")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "-1192556032"
   )
   @Export("sort")
   public final void sort() {
      if (this.comparator == null) {
         Arrays.sort(this.array, 0, this.size);
      } else {
         Arrays.sort(this.array, 0, this.size, this.comparator);
      }

   }

   @ObfuscatedName("bk")
   @ObfuscatedSignature(
      descriptor = "(Lqm;Lun;Lun;S)V",
      garbageValue = "255"
   )
   @Export("changeName")
   final void changeName(User var1, Username var2, Username var3) {
      this.mapRemove(var1);
      var1.set(var2, var3);
      this.mapPut(var1);
   }

   @ObfuscatedName("bv")
   @ObfuscatedSignature(
      descriptor = "(Lqm;B)I",
      garbageValue = "3"
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

   @ObfuscatedName("bz")
   @ObfuscatedSignature(
      descriptor = "(Lqm;I)V",
      garbageValue = "372054520"
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

   @ObfuscatedName("bm")
   @ObfuscatedSignature(
      descriptor = "(Lqm;I)V",
      garbageValue = "-1545395956"
   )
   @Export("arrayAddLast")
   final void arrayAddLast(User var1) {
      this.array[++this.size - 1] = var1;
   }

   @ObfuscatedName("br")
   @ObfuscatedSignature(
      descriptor = "(Lqm;I)V",
      garbageValue = "-43811008"
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

   @ObfuscatedName("bu")
   @ObfuscatedSignature(
      descriptor = "(II)V",
      garbageValue = "-2109592658"
   )
   @Export("arrayRemove")
   final void arrayRemove(int var1) {
      --this.size;
      if (var1 < this.size) {
         System.arraycopy(this.array, var1 + 1, this.array, var1, this.size - var1);
      }

   }

   @ObfuscatedName("by")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "734956571"
   )
   @Export("removeComparator")
   public final void removeComparator() {
      this.comparator = null;
   }

   @ObfuscatedName("bt")
   @ObfuscatedSignature(
      descriptor = "(Ljava/util/Comparator;I)V",
      garbageValue = "2050132295"
   )
   @Export("addComparator")
   public final void addComparator(Comparator var1) {
      if (this.comparator == null) {
         this.comparator = var1;
      } else if (this.comparator instanceof AbstractUserComparator) {
         ((AbstractUserComparator)this.comparator).addComparator(var1);
      }

   }

   @ObfuscatedName("if")
   @ObfuscatedSignature(
      descriptor = "(Ldi;IB)V",
      garbageValue = "36"
   )
   static final void method7862(Actor var0, int var1) {
      Decimator.worldToScreen(var0.x, var0.y, var1);
   }
}
