
import android.app.Activity
import android.content.Context
import android.content.Intent
import android.content.IntentFilter
import android.graphics.*
import android.os.Build
import android.os.Handler
import android.support.v4.content.ContextCompat
import android.text.Editable
import android.text.TextWatcher
import android.view.View

/**
 * Created by Nes Espresso on 15/11/2018 AD.
 */
fun String.toUpdateVersion(new:String):Boolean{

    // split string version to array
    val oldVersions = this.split(".")
    val newVersions = new.split(".")

    val minSize = Math.min(oldVersions.size,newVersions.size)

    if (minSize < 0){
        return false
    }

    for (i in 0..(minSize - 1)){

        var oldVersion = 0
        var newVersion = 0

        if (oldVersions[i].toIntOrNull() is Int){
            oldVersion = oldVersions[i].toInt()
        }

        if (newVersions[i].toIntOrNull() is Int){
            newVersion = newVersions[i].toInt()
        }

//        System.out.println("oldVersion : $oldVersion")
//        System.out.println("newVersion : $newVersion")

        if(oldVersion != newVersion){
            if(oldVersion < newVersion){
                return true
            }

            return false
        }
    }

    if(oldVersions.size < newVersions.size){
        return true
    }

    return false
}






































