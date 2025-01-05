package com.example.myapplication.ui.blank;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.example.myapplication.databinding.FragmentBlankBinding;

//import androidx.annotation.Nullable;

public class BlankFragment extends Fragment {

    //private BlankViewModel mViewModel;
    private FragmentBlankBinding binding;;

    //public static BlankFragment newInstance() {
    //    return new BlankFragment();
    //}

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container,
                             Bundle savedInstanceState) {
        //return inflater.inflate(R.layout.fragment_blank, container, false);
        BlankViewModel blankViewModel =
                new ViewModelProvider(this).get(BlankViewModel.class);

        binding = FragmentBlankBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        final TextView textView = binding.textBlank;
        blankViewModel.getText().observe(getViewLifecycleOwner(), textView::setText);
        return root;
    }

    //@Override
    //public void onActivityCreated(@Nullable Bundle savedInstanceState) {
     //   super.onActivityCreated(savedInstanceState);
      //  mViewModel = new ViewModelProvider(this).get(BlankViewModel.class);
      //  // TODO: Use the ViewModel
    //}
    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }

}