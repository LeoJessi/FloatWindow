package top.jessi.floatwindow;

import android.annotation.SuppressLint;
import android.view.MotionEvent;
import android.view.View;

/**
 *    author : Android 轮子哥
 *    github : https://github.com/getActivity/EasyWindow
 *    time   : 2019/01/04
 *    desc   : {@link View.OnTouchListener} 包装类
 */
@SuppressWarnings("rawtypes")
final class ViewTouchWrapper implements View.OnTouchListener {

    private final FloatWindow<?> mFloatWindow;
    private final FloatWindow.OnTouchListener mListener;

    ViewTouchWrapper(FloatWindow<?> floatWindow, FloatWindow.OnTouchListener listener) {
        mFloatWindow = floatWindow;
        mListener = listener;
    }

    @SuppressLint("ClickableViewAccessibility")
    @SuppressWarnings("unchecked")
    @Override
    public boolean onTouch(View view, MotionEvent event) {
        if (mListener == null) {
            return false;
        }
        return mListener.onTouch(mFloatWindow, view, event);
    }
}